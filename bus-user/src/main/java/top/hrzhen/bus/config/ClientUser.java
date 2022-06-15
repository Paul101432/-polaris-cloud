package top.hrzhen.bus.config;


import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@RefreshScope
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "user.client")
public class ClientUser implements Serializable {

    private String appKey;

    private String clientCode;

}
