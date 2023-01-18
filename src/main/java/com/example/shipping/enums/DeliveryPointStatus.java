package com.example.shipping.enums;

public enum DeliveryPointStatus {

    BRANCH(1),
    DISTRIBUTION_CENTER(2),
    TRANSFER_CENTER(3);

    private int key;

    DeliveryPointStatus(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static DeliveryPointStatus convertValue(int key) {
        for (DeliveryPointStatus deliveryPointStatus : values()) {
            if (deliveryPointStatus.getKey() == key) {
                return deliveryPointStatus;
            }
        }
        return null;
    }

}
