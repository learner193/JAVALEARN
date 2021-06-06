package testpackage6;

public class Javatestclass6 {
	public static void main(String[] argv) {
		Couter a=new Couter();
		Couter.Cinner b=a.new Cinner();
		b.innad();
		b.oiic();
		System.out.println("*****************************");
		a.outp();
		a.oip();
		b.indad();
		b.indad();
		b.indad();
		b.indad();
		b.indad();
	}
}

class Couter {
	int outc = 21;
	int inc=1221;
	void outp() {
		System.out.println("this is outer class");
	}

	class Cinner {
		int ind=0;
		void innerp() {
			System.out.println("this is inner class");
		}		
		void innad() {
			inc=inc+outc;
			System.out.println("inc="+inc);
		}
		void oiic() {
			outp();
			oip();
		}
		void indad() {
			ind=ind+outc;
			System.out.println("ind="+ind);
		}
		
	}
	void oip(){
		Cinner d=new Cinner();
		d.innad();		
	}
}