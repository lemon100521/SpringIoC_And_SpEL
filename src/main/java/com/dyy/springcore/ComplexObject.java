package com.dyy.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {

    private Properties properties;
    private List<Object> list;
    private Set set;
    private Map<Integer,Object> map;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map<Integer, Object> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "properties=" + properties +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
