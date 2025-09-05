package com.central.oauth2.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Token配置
 *
 * @author peak
 * @version 1.0
 * @date 2021/5/19
 * <p>
 * Blog: https://peak2000.gitee.io
 * Github: https://github.com/peak2000
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "peak.oauth2.token.store")
@RefreshScope
public class TokenStoreProperties {
    /**
     * token存储类型(redis/db/authJwt/resJwt)
     */
    private String type = "redis";
}
