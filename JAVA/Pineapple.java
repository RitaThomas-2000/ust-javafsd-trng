package com.ust;

class Fruit {}
class Vehicle{}
public class Pineapple
{
	public static void main(String args[]) {
		Pineapple pineapple=new Pineapple();
		Vehicle truck = new Vehicle();
		System.out.println("pineapple IS A fruit:"+(pineapple instanceof Pineapple));
		System.out.println("truck IS A vehicle: "+(truck instanceof Vehicle));
		
	}
}
