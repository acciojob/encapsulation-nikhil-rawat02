package com.driver;

public class Main {
    RWOnly obj = new RWOnly();
    // if setter is not created error is :'name' has private access in 'RWOnly'
    obj.setName("Nikhil Rawat");
    System.out.println(obj.getName());
}
