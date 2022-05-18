package com.yiran.ritarpc;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = RitaRpcProperties.RITA_RPC_PREFIX
)
@Data
public class RitaRpcProperties {

    public static final String RITA_RPC_PREFIX = "rita-rpc";

    /**
     * 是否启动rpc
     */
    private boolean enable;


}
