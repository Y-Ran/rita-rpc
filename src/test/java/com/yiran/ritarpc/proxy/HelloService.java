package com.yiran.ritarpc.proxy;

@RitaRpc(value = "hello")
public interface HelloService {

    String hello(String name);

}
