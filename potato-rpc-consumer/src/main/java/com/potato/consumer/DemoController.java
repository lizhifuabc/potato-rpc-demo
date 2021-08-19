package com.potato.consumer;

import com.potato.api.UserService;
import com.potato.api.UserService2;
import com.potato.rpc.annotation.PotatoRpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 *
 * @author lizhifu
 * @date 2021/6/29
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @PotatoRpcClient
    private UserService userService;
    @PotatoRpcClient
    private UserService2 userService2;
    @GetMapping("/demo")
    public String demo(){
        return userService.demo();
    }
    @GetMapping("/demo2")
    public String demo2(){
        return userService2.demo();
    }
}
