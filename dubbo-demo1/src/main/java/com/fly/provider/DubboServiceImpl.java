package com.fly.provider;

import com.fly.api.DubboService;

public class DubboServiceImpl implements DubboService {
    @Override
    public String helloDubbo(String name) {
        return "hello : " + name;
    }
}
