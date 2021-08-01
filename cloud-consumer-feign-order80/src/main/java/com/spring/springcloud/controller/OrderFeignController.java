package com.spring.springcloud.controller;

import com.spring.springcloud.entities.CommonResult;
import com.spring.springcloud.entities.Payment;
import com.spring.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xintianweng
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return paymentFeignService.create(payment);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }


    @GetMapping(value = "/consumer/payment/timeout")
    public String getServerPort() {
        return paymentFeignService.getServerPort();
    }

}
