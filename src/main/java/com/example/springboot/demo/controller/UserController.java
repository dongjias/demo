package com.example.springboot.demo.controller;


import com.example.springboot.demo.model.User;
import com.example.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(int id){
        System.out.println(id);
        return "login";
    }
    @RequestMapping("login")
    public String login(User user, HttpSession session, Model model){
        User user1=userService.login(user);
        if(user1!=null){
            session.setAttribute("user",user1);
            model.addAttribute("user1",user1);
            List list=new ArrayList<String>();
            list.add("1");list.add("2");list.add("3");
            model.addAttribute("list",list);
            List list1=new ArrayList<User>();
            for (int i = 0; i < 3; i++) {
                User user2=new User();
                user2.setId(i+1);
                user2.setName("name"+i);
                list1.add(user2);
            }
            model.addAttribute("list1",list1);
            return "index";
        }
        return "login";
    }
}
