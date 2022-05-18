package com.yiran.ritarpc.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class RitaRpcFactoryBean<T> implements FactoryBean<T> {

    private Class<T> rpcInterface;

    public RitaRpcFactoryBean() {
    }

    public RitaRpcFactoryBean(Class<T> rpcInterface) {
        this.rpcInterface = rpcInterface;
    }

    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{rpcInterface},
                new RitaRpcProxyHandler(rpcInterface));
    }

    @Override
    public Class<?> getObjectType() {
        return this.rpcInterface;
    }

}
