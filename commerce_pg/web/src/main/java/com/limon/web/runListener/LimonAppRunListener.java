package com.limon.web.runListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author： ym
 * @description: SpringApplicationListener
 * @date: Created in 4:17 PM 2019/6/9
 * @modified By:
 */
public class LimonAppRunListener implements SpringApplicationRunListener {

    public LimonAppRunListener(SpringApplication application, String[] args){
        System.out.println("constructor");
    }

    @Override
    public void starting() {
        System.out.println("context starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("context started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
