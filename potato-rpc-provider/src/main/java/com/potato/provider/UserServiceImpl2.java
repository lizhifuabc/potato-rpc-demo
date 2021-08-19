package com.potato.provider;

import com.potato.api.UserService2;
import com.potato.rpc.annotation.PotatoRpcServer;

import java.util.UUID;

/**
 * UserServiceImpl
 *
 * @author lizhifu
 * @date 2021/6/29
 */
@PotatoRpcServer
public class UserServiceImpl2 implements UserService2 {
    @Override
    public String demo() {
        return UUID.randomUUID().toString();
    }
}
