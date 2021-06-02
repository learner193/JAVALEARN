package Test2package;

public class calculationTest {
	public static void main(String[] argv) {
		int x,y,z;
		x=y=z=0;
		boolean a,b;
		a=x>0&y++>1;
		System.out.println("a="+a+"\n");
		System.out.println("x="+x+"\n");
		System.out.println("y="+y+"\n");
		b=x>0&&z++>1;
		System.out.println("b="+b+"\n");
		System.out.println("z="+(((z+x)+z)));
		int e=0x10101010;
		System.out.println("e="+e);
		e=0b01010011011;
		System.out.println("e="+Integer.toBinaryString(e));
		e=e>>2;
		System.out.printf("%d\n",e);
		System.out.println("e="+Integer.toBinaryString(e));
		e=-e;
		e=e>>3;
		System.out.printf("%d\n",e);
		System.out.println("e="+Integer.toBinaryString(e));
		x=0b0001010011111001;
		y=0b1001011111100111;
		z=x&y;
		System.out.printf("%s\n",Integer.toBinaryString(z));
		if(x>0) {
			System.out.println("x>0!");
		}else System.out.println("x<0!");
	}
}
