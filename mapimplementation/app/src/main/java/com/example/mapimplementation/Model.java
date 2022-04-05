package com.example.mapimplementation;
public class Model {
    String name;
    int image;
    public String getPhone() {
        return phone;    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    String phone;
    public Model(int ic_launcher_background, String s,String phone) {
        this.image = ic_launcher_background;
        this.name = s;
        this.phone = phone;    }
    public String getName() {
        return name;    }
    public int getImage() {
        return image;   }
}

