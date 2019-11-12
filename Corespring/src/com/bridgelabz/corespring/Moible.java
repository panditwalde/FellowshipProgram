package com.bridgelabz.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Moible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		
          Sim s=(Sim) context.getBean("vodafone");
          s.calling();
          s.data();

	}

}
