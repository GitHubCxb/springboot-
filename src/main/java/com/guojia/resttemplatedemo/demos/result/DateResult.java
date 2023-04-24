package com.guojia.resttemplatedemo.demos.result;

import com.alibaba.fastjson2.JSON;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.List;

@Configuration
public class DateResult<T> extends Result implements Serializable {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
