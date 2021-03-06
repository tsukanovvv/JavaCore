package com.alexander.classwork.lesson5.interfaces.demo2;

interface I1 {
	
	void methodI1();
}

interface I2 extends I1 {

	void methodI2();
}


class A1 {
	public String methodA1() {
		String strA1 = "I am in methodA1 of class A1";
		return strA1;
	}

	public String toString() {
		return "toString() method of class A1";
	}
}

class B1 extends A1 implements I2 {

	public void methodI1() {
		System.out.println("I am in methodI1 of class B1");
	}

	public void methodI2() {
		System.out.println("I am in methodI2 of class B1");
	}
}

class C1 implements I2 {

	public void methodI1() {
		System.out.println("I am in methodI1 of class C1");
	}

	public void methodI2() {
		System.out.println("I am in methodI2 of class C1");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		I1 i1 = new B1();
		//i1.methodI1(); // OK as methodI1 is present in B1
		
		//i1.methodI2();// Compilation error as methodI2 not present in I1
		
		((I2) i1).methodI2();
		
		/*I2 i2 = new B1();
		i2.methodI1(); // OK
		i2.methodI2(); // OK
*/
	}

}
