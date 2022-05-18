package com.yiran.ritarpc;

import com.yiran.ritarpc.proxy.RitaRpcProxyAutoConfiguredScannerRegistrar;
import com.yiran.ritarpc.proxy.RitaRpcScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(RitaRpcProperties.class)
@ConditionalOnProperty(prefix = RitaRpcProperties.RITA_RPC_PREFIX, name = "enable", havingValue = "true", matchIfMissing = true)
public class RitaRpcAutoConfiguration {

    /**
     * 使用 @Configuration 的方式加载动态代理配置类
     */
    @Configuration
    @Import(RitaRpcProxyAutoConfiguredScannerRegistrar.class)
    @ConditionalOnMissingBean(RitaRpcScannerConfigurer.class)
    public static class RitaRpcProxyScannerRegistrarConfiguration {

    }

}
