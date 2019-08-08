package kr.ac.skuniv.lotto;

public class Ball {
	
	private int num;
	
	public Ball(int num) {
		System.out.println("ball을 생성합니다.");
		
		this.num = num;
		
	}
	
	public int getNumber() {
		
		return (int)(Math.random()*num)+1;
	}

}
