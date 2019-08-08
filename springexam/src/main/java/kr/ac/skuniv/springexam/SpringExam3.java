package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.skuniv.game.Game;

public class SpringExam3 {

	public static void main(String[] args) {
		
		System.out.println("공장세우기전");
		ApplicationContext context = new ClassPathXmlApplicationContext("game.xml");
		System.out.println("공장세운 후");
		
		
		Game game = context.getBean(Game.class);
		game.play();
	}

}
