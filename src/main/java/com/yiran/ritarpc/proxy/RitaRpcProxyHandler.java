package com.yiran.ritarpc.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 代理执行器 封装下层逻辑
 *
 * @param <T>
 */
@Slf4j
public class RitaRpcProxyHandler<T> implements InvocationHandler {

    private Class<T> rpcInterface;

    public RitaRpcProxyHandler(Class<T> rpcInterface) {
        this.rpcInterface = rpcInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // todo
        log.info("hello world...");
        return Arrays.toString(args);
    }
}
