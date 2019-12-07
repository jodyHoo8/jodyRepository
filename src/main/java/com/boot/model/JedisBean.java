package com.boot.model;

public class JedisBean {

    private String key;
    private String val;

    public JedisBean(String key,String val) {
        this.key = key;
        this.val = val;
    }

    public  String getKey() {
        return this.key;
    }
    public  String getVal() {
        return this.val;
    }

}


