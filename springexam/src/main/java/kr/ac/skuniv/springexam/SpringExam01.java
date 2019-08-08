package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam01 {

	public static void main(String[] args) {
		
		System.out.println("공장세우기전");
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
		System.out.println("공장세운 후");
		
		myBean mybean = (myBean)context.getBean("mybean",myBean.class);			//클래스 타입으로 직접 넣어도 가능하다
		mybean.setName("h");
		System.out.println(mybean.getName());
		
		
		myBean mybean2 = context.getBean("mybean2",myBean.class);
		mybean2.setName("kim");
		System.out.println(mybean2.getName());
		System.out.println(mybean.getName()); 		//싱글턴타입, 같은걸 가져온다.
		
		//mybean과 mybean2는 같은 객체이다.
		

	}

}
