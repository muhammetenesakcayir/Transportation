package com.example.shipping.enums;

public enum LoadStatus {

    UPLOADED(1),
    UNLOADED(2);

    private final int key;
    LoadStatus(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static String convertValue(int key){
        for (LoadStatus loadStatus : values()) {
            if (loadStatus.getKey() == key){
                return loadStatus.name();
            }
        }
        return null;
    }
}
