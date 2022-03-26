package com.addsub;

public class Bhuvana {
private int a;
private int b;
private int c;
public Bhuvana(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public int getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
public void calculateAddition() {
	int Addition=a+b+c;
	System.out.println(Addition);
}

public void calculateMultiplication() {
	int Multiplication=a*b*c;
	System.out.println(Multiplication);
}
}
