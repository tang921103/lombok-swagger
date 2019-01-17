package com.qiu.hombok;

import com.qiu.hombok.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HombokApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        User user = new User();
        user.setId(2);
        System.out.println(user);
    }
}

