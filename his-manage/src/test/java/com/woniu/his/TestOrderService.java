package com.woniu.his;

import com.woniu.his.service.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HisManager.class)
public class TestOrderService {
    @Autowired
    IOrderService orderService;
    @Test
    public void testOrderr(){
        orderService.countTotalPrice(1);
    }
}
