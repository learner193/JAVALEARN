package testpackage6;

public class Javatestclass7 {
	public static void main(String[] argv) {
		aua(new aia() {
			public void aa() {
				System.out.println("anonymous inner class");			
			}			
		});
	aua(()->System.out.println("anonymous inner class22"));
	}
	static void aua(aia a) {
		a.aa();
	}
}

interface aia {
	void aa();
}