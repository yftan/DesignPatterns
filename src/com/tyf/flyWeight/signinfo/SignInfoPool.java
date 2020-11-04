package com.tyf.flyWeight.signinfo;

public class SignInfoPool extends SignInfo {
    private String key;

    SignInfoPool(String _key){
        this.key = _key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
