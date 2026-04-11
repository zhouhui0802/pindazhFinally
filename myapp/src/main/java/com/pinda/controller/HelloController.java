package com.pinda.controller;

import com.pinda.log.MyLog;
import com.pinda.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //HelloService在我们自定义的starter中已经完成了自动配置，所以此处可以直接注入
    @Autowired
    private HelloService helloService;

    @GetMapping("/say")
    @MyLog(desc = "sayHello方法") //日志记录注解
    public String sayHello(){
        return helloService.sayHello();
    }
}
