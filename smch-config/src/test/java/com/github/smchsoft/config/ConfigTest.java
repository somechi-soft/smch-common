package com.github.smchsoft.config;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConfigTest {

    @Test
    public void testGetConfig() {
        Assertions.assertEquals("postgres",ConfigUtil.get("db").get("user"));
    }
}
