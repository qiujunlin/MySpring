package com.test;

import org.junit.Test;

import com.spring.Car;
import com.spring.MyIOC;
import com.spring.Wheel;

public class TestIOC {
    @Test
    public void test1() throws Exception {
    	 String location = MyIOC.class.getClassLoader().getResource("bean.xml").getFile();
   	  System.out.println(location);
   	  MyIOC bf = new MyIOC(location);
         Wheel wheel = (Wheel) bf.getBean("wheel");
         System.out.println(wheel);
         Car car = (Car) bf.getBean("car");
         System.out.println(car);
   }
}
