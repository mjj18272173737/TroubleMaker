package com.kandashan.admin.service;

import java.util.Set;

/**
 * Created by CPR199 on 2016-10-18.
 */
public interface IRedisService {

    /**
     * 通过key删除（字节）
     * @param key
     */
    public void del(byte[] key);
    /**
     * 通过key删除
     * @param key
     */
    public void del(String key);

    /**
     * 添加key value 并且设置存活时间(byte)
     * @param key
     * @param value
     * @param liveTime
     */
    public void set(byte[] key, byte[] value, int liveTime);
    /**
     * 添加key value 并且设置存活时间
     * @param key
     * @param value
     * @param liveTime
     */
    public void set(String key, String value, int liveTime);
    /**
     * 添加key value
     * @param key
     * @param value
     */
    public void set(String key, String value);
    /**添加key value (字节)(序列化)
     * @param key
     * @param value
     */
    public void set(byte[] key, byte[] value);
    /**
     * 获取redis value (String)
     * @param key
     * @return
     */
    public String get(String key);
    /**
     * 获取redis value (byte [] )(反序列化)
     * @param key
     * @return
     */
    public byte[] get(byte[] key);

    /**
     * 通过正则匹配keys
     * @param pattern
     * @return
     */
    public Set<String> keys(String pattern);

    /**
     * 检查key是否已经存在
     * @param key
     * @return
     */
    public boolean exists(String key);
    /**
     * 清空redis 所有数据
     * @return
     */
    public String flushDB();
    /**
     * 查看redis里有多少数据
     */
    public long dbSize();
    /**
     * 检查是否连接成功
     * @return
     */
    public String ping();


}
