package com.example.provider;

import org.springframework.cloud.consul.config.watch.ConfigChangeCallback;
import org.springframework.cloud.consul.config.watch.ConfigChangeListener;
import org.springframework.cloud.consul.config.watch.ConfigProperty;

/**
 * 配置变更监听
 */
@ConfigChangeListener(prefix = "provider.config", async = true)
public class SimpleConfigurationListener implements ConfigChangeCallback {


    @Override
    public void callback(ConfigProperty lastConfigProperty, ConfigProperty newConfigProperty) {

        System.out.println("receive Consul Config Change Event >>>> ");
        System.out.println("Last config: [" + newConfigProperty.getKey() + ":" + lastConfigProperty.getValue() + "]");
        System.out.println("Current config: [" + newConfigProperty.getKey() + ":" + lastConfigProperty.getValue() + "]");

    }
}
