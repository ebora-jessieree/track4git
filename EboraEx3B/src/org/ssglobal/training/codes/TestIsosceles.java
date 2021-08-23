package org.ssglobal.training.codes;

public class TestIsosceles {
	public static void main(String[] args) {
		Isosceles iso = new Isosceles();
		System.out.println(iso.isosceles(2, 2, 3));
		System.out.println(iso.isosceles(56, 52, 53));
		System.out.println(iso.isosceles(222, 222, 73));
		System.out.println(iso.isosceles(20, 20, 20));
		System.out.println(iso.isosceles(23, 23, 35));
	}

}
