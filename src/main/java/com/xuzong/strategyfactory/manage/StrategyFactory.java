/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.xuzong.strategyfactory.manage;

/**
 * @author xuzong
 * @version : StrategyFactory.java, v 0.1 2020年11月26日 11:33 xuzong Exp $
 */

import com.xuzong.strategyfactory.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略模式的工厂类
 */
@Component
public class StrategyFactory {


    @Autowired
    Map<String, NotifyService> strategyMap = new ConcurrentHashMap<>();

    /**
     * @param type
     * @return com.mybank.api.service.MybankStrategy
     * @Description 根据对应通知的策略bean id获取对应策略实现类对象
     **/
    public NotifyService getStrategy(String type) throws Exception {
        String key = "";
        if ("1".equals(type)){
            key = "notifyService1Impl";
        }
        if ("2".equals(type)){
            key = "notifyService2Impl";
        }
        NotifyService strategy = strategyMap.get(key);
        if (strategy == null) {
            throw new Exception();
        }
        return strategy;
    }

}