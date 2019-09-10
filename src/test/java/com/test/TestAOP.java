package com.test;

import org.junit.Test;

import com.aop.Advice;
import com.aop.BeforeAdvice;
import com.aop.HelloService;
import com.aop.HelloServiceImpl;
import com.aop.MethodInvocation;
import com.aop.SimpleAOP;

public class TestAOP {
	 @Test
	    public void getProxy() throws Exception {
	        // 1. 创建一个 MethodInvocation 实现类
	        MethodInvocation logTask = () -> System.out.println("log task start");
	        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
	        
	        // 2. 创建一个 Advice
	        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);
	        
	        // 3. 为目标对象生成代理
	        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl,beforeAdvice);
	        
	        helloServiceImplProxy.sayHelloWorld();
	    }
}
