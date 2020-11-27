/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.xuzong.strategyfactory.controller;

import com.xuzong.strategyfactory.manage.StrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuzong
 * @version : NotifyController.java, v 0.1 2020年11月27日 14:48 xuzong Exp $
 */
@RestController
@RequestMapping("/notify")
public class NotifyController {

    @Autowired
    private StrategyFactory strategyFactory;

    @ResponseBody
    @RequestMapping("/test")
    public String notify(String text,String type) throws Exception {
        return strategyFactory.getStrategy(type).notifyHandle(text);
    }

}