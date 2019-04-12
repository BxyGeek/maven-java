package com.baizhi;

import java.io.Serializable;

/**
 * @Author: buxy
 * @Date: 2019/4/12  9:47
 */
public class User implements Serializable {
    private String id;

    public User(String id) {
        this.id = id;


        System.out.println("this is first");
    }

}
