package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam02 {

	public static void main(String[] args) {
		
		System.out.println("공장세우기전");
		ApplicationContext context = new ClassPathXmlApplicationContext("exam02.xml");
		System.out.println("공장세운 후");
		
		myBean mybean = context.getBean("mybean1",myBean.class);
		System.out.println(mybean.getName());
		System.out.println(mybean.getCount());
		
		
		myBean mybean2 = context.getBean("mybean2", myBean.class);
		System.out.println(mybean2.getName());
		System.out.println(mybean2.getCount());
	}

}
