package com.central.oauth2.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author peak
 * @version 1.0
 * @date 2019/1/4
 * <p>
 * Blog: https://peak2000.gitee.io
 * Github: https://github.com/peak2000
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "peak.security")
@RefreshScope
public class SecurityProperties {
    private AuthProperties auth = new AuthProperties();

    private PermitProperties ignore = new PermitProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();
}
