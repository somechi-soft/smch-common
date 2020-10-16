package com.github.smchsoft.config;

import com.github.smchsoft.core.StringUtil;
import com.github.smchsoft.io.FileUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * config util
 */
public class ConfigUtil {

    /**
     * config cache pool
     */
    private static final Map<String, Config> CONFIG_MAP = new ConcurrentHashMap<>();

    /**
     * get config, if not exist read from conf file
     * lazy singleton mode
     */
    public static Config get(String configName) {
        Config config = CONFIG_MAP.get(configName);
        if (null == config) {
            synchronized (ConfigUtil.class) {
                config = CONFIG_MAP.get(configName);
                if (null == config) {
                    String configPath = StringUtil.isEmpty(FileUtil.getFileExtension()) ?
                            configName : configName + "." + Config.EXT_NAME;
                    config = new Config(configPath);
                    CONFIG_MAP.put(configName, config);
                }
            }
        }
        return config;
    }
}
