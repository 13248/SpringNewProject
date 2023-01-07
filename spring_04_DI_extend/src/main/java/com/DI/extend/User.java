package com.DI.extend;

public class User {
    private int uId;
    private String uName;
    private String uPassword;

    public User(){
    }

    public User(int uId, String uName, String uPassword) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                '}';
    }
}
