package com.hjh.starter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloService {

    HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
    }
}
