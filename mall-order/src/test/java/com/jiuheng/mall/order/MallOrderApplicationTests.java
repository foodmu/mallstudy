package com.jiuheng.mall.order;

import com.jiuheng.mall.order.entity.OrderEntity;
import com.jiuheng.mall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MallOrderApplicationTests {

    @Resource
    private OrderService orderService;

    @Test
    void contextLoads() {

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillReceiverEmail("317778007@qq.com");
        boolean isSave = orderService.save(orderEntity);
        if(isSave){
            List<OrderEntity> orderLists = orderService.list();
            orderLists.forEach(System.out::println);
        }
    }

}
