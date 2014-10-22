package com.demo.hello;

/**
 * author : lch
 * date : 2014/10/22
 * depiction :
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hello() {
        this.name = "jack";
    }

    public void sayHi() {
        System.out.println("hi:\t" + this.name);
    }

}