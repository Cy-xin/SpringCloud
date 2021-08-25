package com.spring.springcloud.controller;

import com.spring.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xintianweng
 */
@RestController
public class MessageController {

    @Resource
    private IMessageProvider provider;

    @GetMapping(value = "/sendMessage")
    public String send() {
        String result = provider.send();
        return result;
    }

}
