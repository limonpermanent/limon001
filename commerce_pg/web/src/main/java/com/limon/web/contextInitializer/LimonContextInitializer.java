package com.limon.web.contextInitializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author： ym
 * @description: ApplicationContextInitializer
 * @date: Created in 10:58 AM 2019/6/7
 * @modified By:
 */
public class LimonContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("test ApplicationContextInitializer");
    }
}
