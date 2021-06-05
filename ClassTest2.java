package testpackage6;

public class ClassTest2 {
	public static void main(String[] argv){
	Small i=new Small();
	i.speak2();
	i.speak();
	}
}
abstract class Big{	
	Big() {	}
	public abstract void speak() ;
}
abstract class Middle extends Big{
	abstract void speak2();
}
class Small{
	public void speak(){
		System.out.println("‡ªŒÿ‡ªŒÿ");
	}	
	public void speak2(){
		System.out.println("Õ€—Ω—Ω—Ω");
	}
}
