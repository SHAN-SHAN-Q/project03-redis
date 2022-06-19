package com.example.project03redis.service.impl;

import com.example.project03redis.service.TestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName TestRedisServiceImpl
 * @Author 山山大魔王
 * @Date 2022/6/20 1:13
 * @Version 1.0
 */
@Service
public class TestRedisServiceImpl implements TestRedisService {
    @Resource
    RedisTemplate<String,String> redisTemplate;

    @Override
    public void add() {
        redisTemplate.opsForValue().set("key1", "value1");
    }
}
