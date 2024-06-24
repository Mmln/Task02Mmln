package org.stepup.stream6.entities;

import java.lang.reflect.Proxy;

public class Utils {
    public static <T> T cache(T arg){
        return (T) Proxy.newProxyInstance(
                arg.getClass().getClassLoader(),
                arg.getClass().getInterfaces(),
                new CachingHandler<>(arg));
    }
}
