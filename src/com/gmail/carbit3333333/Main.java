package com.gmail.carbit3333333;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector3D one = new Vector3D(12, 2, 5);
		Vector3D two = new Vector3D(5, 4, 2);
		Vector3D three = new Vector3D();

		System.out.println(three.scalarMultiplication(one, two));
		System.out.println(three.addVector3D(one, two));
	}

}
