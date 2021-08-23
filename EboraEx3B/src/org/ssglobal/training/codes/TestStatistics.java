package org.ssglobal.training.codes;

public class TestStatistics {
	
	public static void main (String[] args) {
		
		//instantiate
		Statistics st = new Statistics();
		st.compute(3,4,5,6,7,8);
		st.compute(9,67,33,5,2);
		st.compute(2,2);
		st.compute(4,6,5,4);
		st.compute(7,4,2,1,4);
	}
}
