package org.stepup.stream6.entities;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.stepup.stream6.annotations.Cache;
import org.stepup.stream6.annotations.Mutator;

public class CachingHandler <T> implements InvocationHandler {
private T arg;
private Map<Method, Object> res = new HashMap<>();

    public CachingHandler(T arg) {
        this.arg = arg;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object objResult;
        Method curMethod;

        curMethod =  arg.getClass().getMethod(method.getName(), method.getParameterTypes());
        if(curMethod.isAnnotationPresent(Cache.class)){
            if (res.containsKey(curMethod)){
                return res.get(curMethod);
            }
            objResult = curMethod.invoke(arg,args);
            res.put(curMethod, objResult);
            return objResult;
        }

        if (curMethod.isAnnotationPresent(Mutator.class)){
            res.clear();
        }

        return curMethod.invoke(arg,args);
    }
}
