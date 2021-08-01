package com.spring.springcloud.service;

import com.spring.springcloud.entities.CommonResult;
import com.spring.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xintianweng
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * Create Order
     *
     * @param payment payment
     * @return
     */
    @GetMapping(value = "/payment/create")
    CommonResult<Payment> create(Payment payment);

    /**
     * Get order information by ID
     *
     * @param id id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/timeout")
    String getServerPort();
}
