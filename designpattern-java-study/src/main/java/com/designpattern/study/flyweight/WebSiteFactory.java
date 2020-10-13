package com.designpattern.study.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String, ConcreteWebSite> poolMap = new HashMap<>();

    public WebSite getWebSiteCategory(String code) {
        if (!poolMap.containsKey(code)) {
            poolMap.put(code, new ConcreteWebSite(code));
        }
        return poolMap.get(code);
    }


    public int getWebSiteCount() {
        return poolMap.size();
    }
}
