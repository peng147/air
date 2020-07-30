package cn.ben.air.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerImpl implements DemoController {


    public String healthCheck() {
        return "hello demo";
    }
}
