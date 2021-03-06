package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/9 15:13
 * @author:蛙课网
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/json/detail")
    public @ResponseBody Object userJsonDetail() {
        Map<String,Object> retMap = new HashMap<String, Object>();
        retMap.put("id",1001);
        retMap.put("username","wangwu");

        return retMap;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPageDetail(Model model) {
        model.addAttribute("id",1002);
        model.addAttribute("username","zhaoliu");
        return "userDetail";
    }
}
