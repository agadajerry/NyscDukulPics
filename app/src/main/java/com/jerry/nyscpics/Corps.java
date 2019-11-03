package com.jerry.nyscpics;

class Corps {
    private String name;
    private int logoId;
    private String phoneNo;


    public Corps(String name, int logoId, String phoneNo) {
        this.name = name;
        this.logoId = logoId;
        this.phoneNo = phoneNo;

    }

    public String getPhoneNo() {
        return phoneNo;
    }


    public String getName() {
        return name;
    }

    public int getLogoId() {
        return logoId;
    }

    public Corps(String name, int logoId) {
        this.name = name;
        this.logoId = logoId;
    }
}
