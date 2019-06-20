package com.citic.penguin;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author： ym
 * @description: ThreadLocalTest
 * @date: Created in 2:50 PM 2019/6/20
 * @modified By:
 */
@Slf4j
public class threadlocal {
    private static ThreadLocal<DateFormat> sdf = ThreadLocal.withInitial(() -> {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
    );

    public static Date parse(String dateStr) {
        Date date = null;
        try {
            date = sdf.get().parse(dateStr);
        } catch (ParseException e) {
            log.info("slf4j");
        }
        return date;
    }

    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(5, 10, 100,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100),
                new ThreadPoolExecutor.AbortPolicy());

        try {
            for (int i = 0; i < 10; i++) {
                service.submit(() -> {
                    System.out.println(threadlocal.parse("2019-06-20 20:00:00"));
                });
            }
        } finally {
            service.shutdown();
        }

    }
}
