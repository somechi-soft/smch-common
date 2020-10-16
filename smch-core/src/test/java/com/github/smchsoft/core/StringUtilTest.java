package com.github.smchsoft.core;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilTest {
    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(StringUtil.isEmpty(""));
        Assertions.assertTrue(StringUtil.isEmpty(null));
        Assertions.assertFalse(StringUtil.isEmpty("abc"));
    }
}
