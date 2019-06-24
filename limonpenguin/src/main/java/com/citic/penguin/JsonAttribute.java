package com.citic.penguin;

import lombok.Data;

import java.io.Serializable;

/**
 * @author： ym
 * @description: 属性类
 * @date: Created in 7:58 PM 2019/6/20
 * @modified By:
 */
@Data
public class JsonAttribute implements Serializable {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name: " + this.getName() + " age: " + this.getAge();
    }
}
