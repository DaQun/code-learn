//package com.chenq.learn.cache;
//
//import net.sf.ehcache.Cache;
//import net.sf.ehcache.CacheManager;
//import net.sf.ehcache.Ehcache;
//import net.sf.ehcache.Element;
//import net.sf.ehcache.hibernate.EhCacheRegionFactory;
//import net.sf.ehcache.hibernate.strategy.EhcacheAccessStrategyFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class CacheTest {
//
//    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(CacheTest.class);
//        logger.warn("10086");
//        logger.info("sdddddd");
//        // 1. 创建缓存管理器
//        CacheManager cacheManager = CacheManager.create();
//
//        // 2. 获取缓存对象
//        Cache cache = cacheManager.getCache("HelloWorldCache");
//
//        // 3. 创建元素
//        Element element = new Element("key1", "value1");
//
//        // 4. 将元素添加到缓存
//        cache.put(element);
//
//        // 5. 获取缓存
//        Element value = cache.get("key1");
//        System.out.println(value);
//        System.out.println(value.getObjectValue());
//
//        // 6. 删除元素
//        cache.remove("key1");
//
//        Dog dog = new Dog(1L, "taidi", (short)2);
//        Element element2 = new Element("taidi", dog);
//        cache.put(element2);
//        Element value2 = cache.get("taidi");
//        Dog dog2 = (Dog) value2.getObjectValue();
//        System.out.println(dog2);
//        Element value3 = cache.get("taidi");
//        Dog dog3 = (Dog) value3.getObjectValue();
//        System.out.println(dog3);
//
//        System.out.println(cache.getSize());
//
//        // 7. 刷新缓存
//        cache.flush();
//
//
//        // 8. 关闭缓存管理器
//        cacheManager.shutdown();
//    }
//}