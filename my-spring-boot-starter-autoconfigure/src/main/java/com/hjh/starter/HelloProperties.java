package com.hjh.starter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hjh.hello")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloProperties {

    private String prefix;

    private String suffix;

}
