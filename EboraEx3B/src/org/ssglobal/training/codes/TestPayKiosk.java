package org.ssglobal.training.codes;

public class TestPayKiosk {

	public static void main(String[] args) {
		//instantiate
		PayKiosk pk = new PayKiosk();
		pk.charge(20, 5);
		pk.charge(60, 100);
		pk.charge(300, 30);
		pk.charge(0,0);
		pk.charge(50,0);

	}

}
