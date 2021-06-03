package whatPackage;

public class JavaTest3 {
	public static void main(String[] argv) {
		double a;
		double b;
		b = Math.random();
		System.out.println("b=" + b);
		a = Math.ceil(10 * b) + 1;
		System.out.println("a=" + a);
		switch ((int) a) {
		case 1:
			System.out.println("a=1?" + a);
			break;
		case 2:
			System.out.println("a=2?" + a);
			break;
		case 3:
			System.out.println("a=3?" + a);
			break;
		case 4:
			System.out.println("a=4?" + a);
			break;
		case 5:
			System.out.println("a=5?" + a);
			break;
		case 6:
			System.out.println("a=6?" + a);
			break;
		case 7:
			System.out.println("a=7?" + a);
			break;
		case 8:
			System.out.println("a=8?" + a);
			break;
		case 9:
			System.out.println("a=9?" + a);
			break;
		case 10:
			System.out.println("a=10?" + a);
			break;
		default:
			System.out.println("oops");
			break;
		}
		System.out.println(b);

		int i = 0;
		int[] f = new int[100];
		do {
			f[i] = (int) (Math.random() * 100);
			i++;
		} while (i < 99);
		for (i = 0; i < 100; i++)
			System.out.println(f[i]);

		String[] stra = new String[] { "각것각것", "whhaat", "pulipuli", "wuriwuri" };
		char[] chc = { 'a', 'b', 'b', 'n', 's' };
		System.out.println(stra[0] + chc[2]);

		int[] qp;
		qp = new int[1000];
		i = 0;
		while (i < 1000) {
			qp[i] = (int)Math.floor(Math.random() * 1000);
			i++;
		}
		for (i = 0; i < 1000; i++)
			System.out.printf("%d ", qp[i]);
		i=qp.length;
		System.out.printf("\nlengthi=%d \n", i);
		Object[] obj1;
		obj1=new Object[] {11212,2121.333,'i',"addawda"};
		System.out.println((int)obj1[0]+" "+(double)obj1[1]);
	}
}
