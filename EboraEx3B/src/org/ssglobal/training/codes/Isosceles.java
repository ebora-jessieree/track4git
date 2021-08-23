package org.ssglobal.training.codes;

public class Isosceles {

	public boolean isosceles(int side1, int side2, int side3) {
		if(side1==side2 || side2 == side3 || side3 == side1) {
			return true;
		}else {
			return false;
		}
	}
}