package com.limon.web.ApplicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author： ym
 * @description: ApplicationListener
 * @date: Created in 10:43 AM 2019/6/10
 * @modified By:
 */
@Component
public class LimonAppListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent applicationEvent) {
        System.out.println("Context Refreshed Event");
    }
}
