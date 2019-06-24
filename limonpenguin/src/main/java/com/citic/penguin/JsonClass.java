package com.citic.penguin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author： ym
 * @description: FastJson
 * @date: Created in 7:56 PM 2019/6/20
 * @modified By:
 */
public class JsonClass {

    public void serialize(){
        JsonAttribute attribute = new JsonAttribute();
        attribute.setAge(12);
        attribute.setName("limon");

        Object jobject = JSONObject.toJSON(attribute);


    }

    public static void main(String[] args) {
        JsonAttribute attribute = new JsonAttribute();
        attribute.setAge(12);
        attribute.setName("limon");

//        {"name":"limon","age":12}
        String str = JSONObject.toJSONString(attribute);
        System.out.println(str);

        JsonAttribute attr = JSONObject.parseObject(str,JsonAttribute.class);
        System.out.println(attr.toString());
        System.out.println(attr.getAge());
    }
}
