package com.javaex.api.objectclass.v4;

import java.util.Arrays;

//	v4. 참조 타입 필드를 가진 객체의 복사
public class Scoreboard implements Cloneable{
	//	필드 : 참조 타입
	private int scores[];	//	정수 배열
	
	//	생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	//	Getters / Setters
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//	복제 메서드 
	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("복제를 지원하지 않음");
		}
		return clone;
	}

	//	출력을 위한 toString 오버라이드
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
}







