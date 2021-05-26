class A {
	public A() {
		System.out.println("In A");
	}

	public A(int i) {
		System.out.println("In A int");
	}
}
class B extends A {
		public B() {
			System.out.println("In B");
		}

		public B(int i) {
			super(i);
			System.out.println("In B int");
		}
	}

public class SuperMethod {

	public static void main(String[] args) {
    A obj = new A();
    B obj1 = new B(2);
    
	}
	
}
