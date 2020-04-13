package com.cxloyalty.gce.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("actor")
@Getter
@Setter
public class ActorConfig {
    private String clusterName;
    private String conf;
    private Map<String, String> supportedEntities;

    public Class<?> entityClassFor(String entityType) throws ClassNotFoundException {
        String className = supportedEntities.get(entityType);
        return Class.forName(className);
    }
}
