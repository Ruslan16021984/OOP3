package com.gmail.carbit3333333;

public class Vector3D {
	private double x;
	private double y;
	private double z;

	public Vector3D() {
		super();
	}

	public Vector3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D addVector3D(Vector3D vectorOne, Vector3D vectorTwo) {

		x = vectorOne.getX() + vectorTwo.getX();
		y = vectorOne.getY() + vectorTwo.getY();
		z = vectorOne.getZ() + vectorTwo.getZ();
		return new Vector3D(z, y, z);
	}

	public Vector3D scalarMultiplication(Vector3D vectorOne, Vector3D vectorTwo) {
		x = vectorOne.getX() * vectorTwo.getX();
		y = vectorOne.getY() * vectorTwo.getY();
		z = vectorOne.getZ() * vectorTwo.getZ();
		return new Vector3D(z, y, z);
	}

	public Vector3D multiplication(Vector3D vectorOne, Vector3D vectorTwo) {
		x = (vectorOne.getY() * vectorTwo.getZ()) - (vectorOne.getZ() * vectorTwo.getY());
		y = (vectorOne.getZ() * vectorTwo.getX()) - (vectorOne.getX() * vectorTwo.getZ());
		z = (vectorOne.getX() * vectorTwo.getY()) - (vectorOne.getY() * vectorTwo.getX());
		return new Vector3D(z, y, z);
	}

	public double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}


	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "Vector3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
