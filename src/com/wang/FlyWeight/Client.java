package com.wang.FlyWeight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeightFectory chessFlyWeightFectory = new ChessFlyWeightFectory();
		
		
		ChessFlyWeight chess = chessFlyWeightFectory.getChess("��ɫ");
		
		chess.display(new Coordinate(10, 10));	
	}
}
