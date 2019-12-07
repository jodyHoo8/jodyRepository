package com.boot.controller;


import com.boot.model.JedisBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;


@RestController
public class JedisController {

    @Autowired
    private Jedis jedis;

    @RequestMapping(value="/jedis",method= RequestMethod.GET)
    public JedisBean jedisBean(@RequestParam(
                                value="name",
                                defaultValue="World")
                                String key) {

        String val = jedis.get( key );

        JedisBean jedisBean = new JedisBean(key,val);

        return jedisBean;

    }

}


