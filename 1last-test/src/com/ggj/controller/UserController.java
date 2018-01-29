package com.ggj.controller;

import com.ggj.model.User;
import com.ggj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/1/29.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/jumptoRegest")
    public String regest()throws Exception{
        return "regest";
    }

    @RequestMapping("/regest")
    public String regestll(User user,HttpSession session)throws Exception{
        userService.saveUser(user);
        return "../../index";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session)throws Exception{
        User user1 = userService.login(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "inner";
        }
        return "../../index";
    }
    @RequestMapping("/checkName")
    public void checkName(String name, HttpServletResponse response)throws Exception{
        User user1 = userService.checkName(name);
        if (user1!=null){
            response.getWriter().print("111");
        }else {
            response.getWriter().print("11");
        }
    }
}
