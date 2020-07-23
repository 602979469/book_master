package net.dulao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 书主应用程序
 *
 * @author Faker
 * @date 2020/07/23
 */
@MapperScan("net.dulao.dao")
@SpringBootApplication
public class BookMasterApplication {

    /**
     * 主要
     *
     * @param args arg游戏
     */
    public static void main(String[] args) {
        SpringApplication.run(BookMasterApplication.class, args);
    }

}
