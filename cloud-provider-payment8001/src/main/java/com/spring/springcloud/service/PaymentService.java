package com.spring.springcloud.service;

import com.spring.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author xintianweng
 */
public interface PaymentService {

    /**
     * Create Order
     *
     * @param payment payment
     * @return
     */
    int create(Payment payment);

    /**
     * Get order information by ID
     *
     * @param id id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);

}
