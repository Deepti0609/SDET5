package com.fanniemae;

public abstract class Figure {

	public abstract void area();
	
	public void draw(){
		System.out.println("We can draw with pen/pencil...");
	}
}
class Rectangle extends Figure{
	
	int len;
	int bre;
	Rectangle (int len,  int bre){
		this.len =len;
		this.bre = bre;
	}
	@Override
	public void area(){
		System.out.println("Area is " + (len * bre));
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("To Draw Rectangle we need a ruler...");
	}
	
	
}

class Sqr extends Figure{
	int len;
	Sqr(int len){
		this.len =len;
		}
	
	@Override
	public void area(){
		System.out.println("Area is " + (len * len));
}
}

class Tri extends Figure {
	int s1;
	int s2;
	int s3;
	Tri(int s1, int s2){
		this.s1=s1;
		this.s2=s2;
		//this.s3=s3;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area is "+ ((s1 *s2)/2));
		
	}}




