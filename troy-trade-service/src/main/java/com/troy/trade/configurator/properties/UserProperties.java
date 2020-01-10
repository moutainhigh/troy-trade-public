package com.troy.trade.configurator.properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 用户相关配置
 *
 * @author Han
 */
@Component
@ConfigurationProperties(prefix = "troy.user")
@Setter
@Getter
public class UserProperties {

    private String publicKey;
}
