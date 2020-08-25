package cn.ben.air;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.ben.air.controller"})
public class AirApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(AirApplication.class,args);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
