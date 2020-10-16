package com.github.smchsoft.config;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Config extends AbstractConfig implements Map<String, String> {
    /**
     * default extension name
     */
    public static final String EXT_NAME = "conf";

    /**
     * grouped config
     */
    private final GroupedConfig groupedConfig = new GroupedConfig();

    public Config(String configName) {
        //load config from config file

        //save config to grouped config

    }

    public String get(String key) {

        return "";
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object o) {
        return false;
    }

    @Override
    public boolean containsValue(Object o) {
        return false;
    }

    @Override
    public String get(Object o) {
        return null;
    }

    @Override
    public String put(String s, String s2) {
        return null;
    }

    @Override
    public String remove(Object o) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return null;
    }
}
