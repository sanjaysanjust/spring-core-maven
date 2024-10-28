package org.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = null;
		
		
		context = new ClassPathXmlApplicationContext("spring2.xml");
		/*
		 * Parent-Child relationship
		 */
		TraingleWithParentChilRltn traingle = (TraingleWithParentChilRltn) context.getBean("traingleWithParentChilRltn");
		traingle.draw();
		/*
		 * Parent-Child List relationship
		 */
		
		TraingleWithParentChilLstRltn traingleLst = (TraingleWithParentChilLstRltn) context.getBean("traingleWithParentChilLstRltn");
		traingleLst.draw();

	}

}
