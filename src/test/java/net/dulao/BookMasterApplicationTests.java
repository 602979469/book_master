package net.dulao;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * 书主应用程序测试
 *
 * @author Faker
 * @date 2020/07/23
 *///@SpringBootTest
class BookMasterApplicationTests {


    @Test
    public void test(){
        String a="dulao";
    }

    /**
     * 函数
     */
    @Test
    public void function(){
        String a="a";
        String b="b";
        String c=a+b;
        String d=new String("ab");
        System.out.println("ab"=="a"+"b");
        System.out.println("ab"==a+b);
        System.out.println(c==a+b);
        System.out.println(c==d);
        System.out.println("ab"==d);
        new HashMap<>();
    }

}
