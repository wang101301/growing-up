package com.wang.growing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author wangyuanyuan@zto.com
 * @Description: 并发编程模块 多线程
 * @date 2018/8/29/15:05
 */
@SpringBootApplication
@EnableAsync
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
