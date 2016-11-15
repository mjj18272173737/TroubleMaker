package com.kandashan.admin.service.impl;

import com.kandashan.admin.service.IRedisService;
import com.kandashan.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Created by silence on 2016-10-27.
 */
@Service("redisService")
public class RedisServiceImpl implements IRedisService {

    //操作redis客户端
    private static Jedis jedis;
    @Autowired
    private JedisConnectionFactory jedisConnectionFactory;

    private Jedis getJedis(){
        if(jedis == null){
            return jedisConnectionFactory.getShardInfo().createResource();
        }
        return jedis;
    }

    public RedisServiceImpl() {
    }

    public void del(byte[] key) {
        this.getJedis().del(key);
    }

    public void del(String key) {
        this.getJedis().del(key);
    }

    public void set(byte[] key, byte[] value, int liveTime) {
        this.set(key, value);
        this.getJedis().expire(key, liveTime);
    }

    public void set(String key, String value, int liveTime) {
        this.set(key, value);
        this.getJedis().expire(key, liveTime);
    }

    public void set(String key, String value) {
        this.getJedis().set(key, value);
    }

    public void set(byte[] key, byte[] value) {
        this.getJedis().set(key, value);
    }

    public String get(String key) {
        String value = this.getJedis().get(key);
        return value;
    }

    public byte[] get(byte[] key) {
        return this.getJedis().get(key);
    }

    public Set<String> keys(String pattern) {
        return this.getJedis().keys(pattern);
    }

    public boolean exists(String key) {
        return this.getJedis().exists(key);
    }

    public String flushDB() {
        return this.getJedis().flushDB();
    }

    public long dbSize() {
        return this.getJedis().dbSize();
    }

    public String ping() {
        return this.getJedis().ping();
    }
}
