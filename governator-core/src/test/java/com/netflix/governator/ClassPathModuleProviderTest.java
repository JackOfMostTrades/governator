package com.netflix.governator;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class ClassPathModuleProviderTest {
    @Test
    public void scanExistingClassPath() {
        ClassPathModuleListProvider provider = new ClassPathModuleListProvider("com.netflix.governator");
        Assert.assertFalse(provider.get().isEmpty());
    }
}
