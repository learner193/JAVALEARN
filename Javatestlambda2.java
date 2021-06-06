package testpackage6;

public class Javatestlambda2 {
	public static void main(String[] argv) {
		StrUp aas=new StrUp();
		
		pus("addad",aas::Strup);
	}
	static void pus(String c,aai d) {
		d.Stup(c);
	}
}
class StrUp{
	void Strup(String a) {
		System.out.println(a.toUpperCase());
		System.out.println(a);
		
	}
}
@FunctionalInterface
interface aai{
	void Stup(String b);
}