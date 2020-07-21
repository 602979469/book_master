package net.dulao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("net.dulao.dao")
@SpringBootApplication
public class BookMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMasterApplication.class, args);
    }

}
