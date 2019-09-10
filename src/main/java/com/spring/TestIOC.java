package com.spring;

public class TestIOC {
  public static void main(String[] args) throws Exception {
	  String location = MyIOC.class.getClassLoader().getResource("bean.xml").getFile();
	  System.out.println(location);
	  MyIOC bf = new MyIOC(location);
      Wheel wheel = (Wheel) bf.getBean("wheel");
      System.out.println(wheel);
      Car car = (Car) bf.getBean("car");
      System.out.println(car);
}
}
