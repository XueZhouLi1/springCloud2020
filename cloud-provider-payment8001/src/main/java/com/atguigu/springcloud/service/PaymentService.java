package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Levi
 * @Classname PaymentService
 * @Description
 * @Date 2021/2/2 15:47
 */
public interface PaymentService {

    /**
     * 新增
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
