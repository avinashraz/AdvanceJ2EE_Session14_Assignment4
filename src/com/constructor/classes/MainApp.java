package com.constructor.classes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TextChecker ch = (TextChecker)context.getBean("con");
		ch.spellCheck();

	}

}
