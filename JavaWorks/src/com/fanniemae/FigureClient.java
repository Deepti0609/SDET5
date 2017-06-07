package com.fanniemae;

public class FigureClient {
	public static void main(String[] args) {
		Figure f[] = new Figure[4];
		f[0] = new Rectangle (10,20);
		f[1] = new Sqr(3);
		f[2] = new Rectangle(44,33);
		f[3] = new Tri(3,4);
		
		for (Figure temp : f){
			temp.area();
			temp.draw();
		}
	}

}
