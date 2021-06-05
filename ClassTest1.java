package testpackage5;

public class ClassTest1 {
	public static void main(String[] argv) {
		What w1=new What();
		w1.name="What class?";
		Subsubwhat ssw1=new Subsubwhat();
		ssw1.subshowwhat();
		ssw1.contends="sad sadasad~~";
		ssw1.data2=112111221;
		ssw1.subshowwhat();
		What.showcode();
		ssw1.data3=ssw1.addsw(What.code,ssw1.data2);
		ssw1.subshowwhat();
	}
}
 class What{
	String name;
	int data1;
	static int code=20210605;
	static void showcode() {
		System.out.println("code of what:"+What.code+"\n");
	}
}
 class Subwhat extends What{
	double data2;
	void showwhat() {
		System.out.println("name="+super.name+"\n"+"data1="+super.data1+"\n"+"data2="+this.data1);
	}
	
}
 class Subsubwhat extends Subwhat{
	 double data3;
	 String contends;
	 Subsubwhat(){
		 this.name="default";
		 this.data1=10000;
		 this.data2=1000.001;
		 this.data3=1000.0001;
		 this.contends="각것각것각것";
	 }
	 void subshowwhat() {
		 System.out.println("name="+super.name+"\n"+"data1="+super.data1+"\n"+"data2="+this.data1+"\n"+"data3="+this.data3+"\n"+"contends="+contends);
	 }
	 double addsw(int a,double b) {
		 return a+b;
	 }
	 double addsw(double a,double b) {
		 return a+b;
	 }
	 double addsw(double a,int b) {
		 return a+b;
	 }
	 
 }
 