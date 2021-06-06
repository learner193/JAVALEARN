package testpackage6;

public class JavatestGC {
	public static void main(String[] argv) {
		woo a=new woo();
		a=null;
		System.gc();
		int i=0;
		for(;i<15;i++)System.out.println("à£à£");
	}	
}
class woo{
	public void finalize(){
		System.out.println("¶ö°¡°¡°¡°¡°¡");
	}
}