package com.wyq.common.domin;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description: //TODO 实体类
 * @Author wyq
 * @Date 2022/4/1 18:15
 */
public class User implements Serializable {
    private int id;

    private  String name;

    private  int age;

    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
