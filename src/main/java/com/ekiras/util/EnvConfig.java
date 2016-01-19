package com.ekiras.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ekansh
 * @since 20/1/16
 */
@Component
public class EnvConfig {

    @Value("${custom.property.name}")
    private String env;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
