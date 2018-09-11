package zhaojinshuai.top.consumer.system.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zhaojinshuai.top.api.entity.User;
import zhaojinshuai.top.api.service.UserService;
@Controller
@RequestMapping("user")
public class UserController {

    @Reference
    UserService userServiceImpl;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable("id") Long id) {
        User user=userServiceImpl.getUserById(id);
        System.err.println(user.toString());
        return JSON.toJSONString(user);
    }
    
    @RequestMapping("filter")
    public String testFilter() {
    	System.out.println("Controller...Filter");
    	return "filter";
    }
    

}
