package com.spring.springcloud.service.Impl;

import com.spring.springcloud.dao.PaymentDao;
import com.spring.springcloud.entities.Payment;
import com.spring.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xintianweng
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment  getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
