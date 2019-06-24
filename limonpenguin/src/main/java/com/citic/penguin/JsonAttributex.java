package com.citic.penguin;

import lombok.Data;

import java.io.Serializable;

/**
 * @author： ym
 * @description: Json序列化对象验证
 * @date: Created in 8:16 PM 2019/6/20
 * @modified By:
 */
@Data
public class JsonAttributex implements Serializable {
    private String sex;
    private Double pay;

    @Override
    public String toString(){
        return "sex:"+this.getSex()+" pay:"+this.getPay();
    }
}
