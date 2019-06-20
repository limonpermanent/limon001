package com.limon.service.facadeImpl;

import com.limon.api.facade.HelloFacade;
import org.springframework.stereotype.Service;

/**
 * @author： ym
 * @description: impl
 * @date: Created in 8:26 AM 2019/6/6
 * @modified By:
 */
@Service("HelloFacadeImpl")
public class HelloFacadeImpl implements HelloFacade {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
