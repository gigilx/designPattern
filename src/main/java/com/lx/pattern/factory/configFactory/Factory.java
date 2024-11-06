package com.lx.pattern.factory.configFactory;

import com.sun.org.apache.bcel.internal.generic.ClassObserver;

import javax.xml.ws.BindingProvider;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 配置文件搭配工厂模式
 */

public class Factory {

    private static Map<String, Coffee> map = new HashMap<>();

    static{
        Properties p = new Properties();
        try {
            InputStream inputStream = Factory.class.getClassLoader().getResourceAsStream("bean.properties");
            p.load(inputStream);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                map.put((String) key , (Coffee) clazz.newInstance());
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static Coffee createCoffee(String key) {
        return map.get(key);
    }
}
