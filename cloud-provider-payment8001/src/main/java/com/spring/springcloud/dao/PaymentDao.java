package com.spring.springcloud.dao;

import com.spring.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xintianweng
 */
@Mapper
public interface PaymentDao {

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
