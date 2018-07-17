package com.dyy.springcore.auto;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.core.NamedThreadLocal;

import java.util.HashMap;
import java.util.Map;

/**
*@Description: 用于线程的自定义作用域
*@Author： dyy
*/

public class SingleThreadScope implements Scope {

    private ThreadLocal<Map<String,Object>> threadLocal = new NamedThreadLocal<Map<String, Object>>("SingleThreadScope"){
        @Override
        protected Map<String, Object> initialValue() {
            return new HashMap<String, Object>();
        }
    };
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map<String ,Object> map = this.threadLocal.get();
        Object bean = map.get(name);
        if(bean==null){
            bean = objectFactory.getObject();
            map.put(name,bean);
        }
        return bean;
    }

    public Object remove(String s) {
        return this.threadLocal.get().remove(s);
    }

    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    public Object resolveContextualObject(String s) {
        return null;
    }

    public String getConversationId() {
        return null;
    }
}
