
public class javaTest4 {
	public static void main(String[] argv){
		Phone iphone7p=new Phone();
		iphone7p.showattribute();
		iphone7p.codeset(19999999999L);
		iphone7p.weightset(0.188);
		iphone7p.showattribute();
	}
}
class Phone{
	private long code;
	private double weight;
	private String name;
	private String cpucode;
	Phone(){
		this.name="default name";
		this.code=10000000000L;
		this.weight=0.00;
		this.cpucode="Qualcomm";
	}
	public void showattribute() {
		System.out.println("phonename:"+this.name+"\n phonecode:"+this.code
				+"\n weight:"+this.weight+"\n cpucode:"+this.cpucode);
	}
	public long codeset(long a) {
		if(a<=0||a>=90000000000L) {
			System.out.println("out of range");
			return -1;
		}
		this.code=a;
		return a;
	}
	public double weightset(double a) {
		if(a<=0||a>=90000000000L) {
			System.out.println("out of range");
			return -1;
		}
		this.weight=a;
		return a;
	}
}
//ÏÂÂÔ