package com.example.bys.result;

import java.util.HashMap;
import java.util.Map;

public class Result {
    //响应码
    private int code;
    private Map<String, Object> extend = new HashMap<String, Object>();

    public Result(int code) {
        this.code = code;
    }

    public Result(int code, Map<String, Object> extend) {
        this.code = code;
        this.extend = extend;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
