package testpackage6;

public class Javatestthrowable1 {
	public static void main(String[] argv) throws Exception {
		int a, b;
		double c;
		a = 10;
		b = 20;
		c=Divide.div((double)a,(double)b);
		System.out.println(c);
	}
}
class Divide{
	static double div(double a,double b)throws Exception{
		double c;
		c=a/b;
		return c;
	}
}