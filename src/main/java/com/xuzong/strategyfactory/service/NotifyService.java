/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.xuzong.strategyfactory.service;

/**
 * @author xuzong
 * @version : NotifyService.java, v 0.1 2020年11月27日 14:37 xuzong Exp $
 * 策略模式的接口类
 */
public interface NotifyService {

    /**
     * 处理通知数据逻辑
     **/
    String notifyHandle(String context);


}