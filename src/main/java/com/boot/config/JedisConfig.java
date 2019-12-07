package com.boot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


@Service
public class JedisConfig {

    @Bean
    public Jedis jedis() {

        // connection ...
        Jedis jedis = new Jedis( "127.0.0.1" , 6379 );

        jedis.auth( "123456" );
        jedis.set( "key0" , "val0" );

        System.out.println(""+jedis.get("key0"));

        return jedis;

    }

}


