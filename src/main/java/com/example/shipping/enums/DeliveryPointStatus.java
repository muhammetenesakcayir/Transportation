package com.example.shipping.enums;

public enum DeliveryPointStatus {

    BRANCH(1),
    DISTRIBUTION_CENTER(2),
    TRANSFER_CENTER(3);

    private final int key;

    DeliveryPointStatus(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static String convertValue(int key){
        for (DeliveryPointStatus deliveryPointStatus:values()) {
            if (deliveryPointStatus.key == key){
                return deliveryPointStatus.name();
            }
        }
        return null;
    }

     public static Integer convertKey(DeliveryPointStatus deliveryPoint){
        for (DeliveryPointStatus deliveryPointStatus:values()) {
            if (deliveryPointStatus.equals(deliveryPoint)){
                return deliveryPointStatus.getKey();
            }
        }
        return null;
    }

}
