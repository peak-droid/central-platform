package ui.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 前端服务
 *
 * @author
 * @date 2020/2/3
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "peak.ui")
@RefreshScope
public class UiProperties {

    private String pathContext = "/";
}
