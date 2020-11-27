/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.xuzong.strategyfactory.service.impl;

import com.xuzong.strategyfactory.service.NotifyService;
import org.springframework.stereotype.Service;

/**
 * @author xuzong
 * @version : NotifyService2Impl.java, v 0.1 2020年11月27日 14:40 xuzong Exp $
 */
@Service("notifyService2Impl")
public class NotifyService2Impl implements NotifyService {
    @Override
    public String notifyHandle(String context) {
        return "NotifyService2Impl:"+context;
    }
}