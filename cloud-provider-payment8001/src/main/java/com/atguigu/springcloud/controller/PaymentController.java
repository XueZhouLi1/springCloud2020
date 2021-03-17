package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author Levi
 * @Classname PaymentController
 * @Description
 * @Date 2021/2/2 15:57
 */
@RestController
@Slf4j
public class PaymentController {
    /** @RestController 必须是这个注解，因为是模拟前后端分离的restful风格的请求，要求每个方法返回 json*/
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;
    @PostMapping(value = "/payment/create")
    /**
     * 注意这里的 @RequestBody  是必须要写的，虽然 MVC可以自动封装参数成为对象，
     * 但是当消费者项目调用，它传参是 payment 整个实例对象传过来的， 即Json数据，因此需要写这个注解
     */
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果：" + result);
        if(result > 0){
            return new CommonResult(200, "插入数据库成功,端口号："+serverPort, result);
        }
        return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("****查询结果：" + result);
        if(result != null){
            return new CommonResult(200, "查询成功,端口号："+serverPort, result);
        }
        return new CommonResult(444, "没有对应id的记录", null);
    }
}
