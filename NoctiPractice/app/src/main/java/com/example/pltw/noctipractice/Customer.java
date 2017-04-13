package com.example.pltw.noctipractice;

/**
 * Created by dsnider on 4/13/17.
 */

public class Customer {
    private static Customer sCustomer;
    private String mName;
    private String[] mAddress;

    private Customer(){}

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String[] getAddress() {
        return mAddress;
    }

    public void setAddress(String[] address) {
        mAddress = address;
    }

    public static Customer get(){
        if (sCustomer == null){
            sCustomer = new Customer();
        }
        return sCustomer;
    }
}
