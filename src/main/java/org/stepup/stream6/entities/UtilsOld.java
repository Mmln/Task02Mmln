package org.stepup.stream6.entities;

import org.stepup.stream6.annotations.Cache;
import org.stepup.stream6.annotations.Mutator;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class UtilsOld<T> implements InvocationHandler {
    private T val;
    private Double cache = null;

    public UtilsOld(T obj) {
        this.val = obj;
    }

    public static <T> T cache(T arg){
        return (T) Proxy.newProxyInstance(arg.getClass().getClassLoader(),
                arg.getClass().getInterfaces(),
                new UtilsOld<>(arg));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method m = val.getClass().getMethod(method.getName(), method.getParameterTypes());

        // anns  array is used, because there can be more than one annotation
        Annotation[] anns = m.getDeclaredAnnotations();

        if (Arrays.stream(anns).anyMatch(x -> (x).annotationType().equals(Mutator.class))){
            System.out.print("Mutator called ");
            cache = null;
        }

        if (Arrays.stream(anns).anyMatch(x -> (x).annotationType().equals(Cache.class))) {
            if( cache == null) {
                cache = (Double) m.invoke(val,args);
                System.out.print(" Cache calculated and returned ");
            } else {
                System.out.print(" Cache returned ");
            }
            return cache;
        }
        return m.invoke(val, args);
    }
}
