package cn.ben.air;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.sino.operation.db.mapper")
@ComponentScan(basePackages = {"cn.ben.air.controller"})
public class AirApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirApplication.class,args);
    }
}
