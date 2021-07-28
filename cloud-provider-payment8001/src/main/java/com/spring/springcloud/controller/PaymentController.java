package com.spring.springcloud.controller;

import com.spring.springcloud.entities.CommonResult;
import com.spring.springcloud.entities.Payment;
import com.spring.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xintianweng
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        CommonResult commonResult;
        log.info("-----插入数据-----");
        if (result > 0) {
            commonResult = new CommonResult(200, "insert data success , serverPort :" + serverPort, result);
        } else {
            commonResult = new CommonResult(400, "insert data fail");
        }
        return commonResult;
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        CommonResult commonResult;
        log.info("-----查询数据-----");
        if (result != null) {
            commonResult = new CommonResult(200, "select data success, serverPort:" + serverPort, result);
        } else {
            commonResult = new CommonResult(400, "select data fail id:" + id);
        }
        return commonResult;
    }
}
