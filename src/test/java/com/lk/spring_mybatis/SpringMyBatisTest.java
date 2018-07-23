package com.lk.spring_mybatis;

import java.util.Date;
import java.util.UUID;

import com.lk.spring_mybatis.dao.User;
import com.lk.spring_mybatis.service.UserService;

//import me.gacl.service.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyBatisTest {

    private UserService userService;
    
    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before(){
        //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring_mybatis/spring.xml","classpath:spring_mybatis/spring-mybatis.xml"});
        //从Spring容器中根据bean的id取出我们要使用的userService对象
        userService = (UserService) ac.getBean("userService");
    }
    
    @Test
    public void testAddUser(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
       /* User user=userService.getUser(2);
        System.out.println(user);*/

        User user1=new User();
        user1.setUsername("test1");
        user1.setPassword("1234567");
        //userService.saveUser(user1);
        userService.getUser(1);
    }
    
}