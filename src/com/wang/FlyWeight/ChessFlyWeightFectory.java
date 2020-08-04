package com.wang.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFectory {

	private Map<String, ChessFlyWeight> map = new HashMap<>();
	
	
	public ChessFlyWeight getChess(String color) {
		if(map.get(color)!=null) {
			return map.get(color);
		}else {
			map.put(color, new ConcreteChess(color));
			return map.get(color);
		}
	}
}
