package com.stu.zhihu;

public class Goods {
    String name;
    int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Goods(String name, int img) {
        this.name = name;
        this.img = img;
    }
}
