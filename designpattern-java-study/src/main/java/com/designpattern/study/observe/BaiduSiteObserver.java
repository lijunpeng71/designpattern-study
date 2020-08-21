package com.designpattern.study.observe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author administrator
 * @description:
 * @date:2020/8/21 14:41
 **/
public class BaiduSiteObserver implements Observer {
    private static Logger logger = LoggerFactory.getLogger(BaiduSiteObserver.class);

    @Override
    public void update(float temperature, float pressure, float humidity) {
        logger.info("baidu");
        logger.info("temperature:{},presure:{},humidity:{}", temperature, pressure, humidity);
    }
}
