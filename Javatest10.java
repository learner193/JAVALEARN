package packagetest10;

import java.text.*;
import java.util.*;
import java.time.*;

public class Javatest10 {
	public static void main(String[] argv) throws ParseException {
		Date date1=new Date();
		DateFormat df1full=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("ȫ���ڸ�ʽ"+df1full.format(date1));
		
		Instant now=Instant.now();
		System.out.println("jdk8���ڣ�"+now);
		System.out.println("�����ڣ�"+date1);
		DateFormat longformat=DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("�����ڸ�ʽ��"+longformat.format(date1));
		
		DateFormat mediumformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("ȫ���ڸ�ʽ������ֵ��"+DateFormat.FULL);
		System.out.println("�����ڸ�ʽ������ֵ��"+DateFormat.LONG);
		System.out.println("�����ڸ�ʽ������ֵ��"+DateFormat.MEDIUM);
		System.out.println("�����ڸ�ʽ����"+mediumformat.format(date1));
		DateFormat df1=DateFormat.getDateInstance();
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);
		String str1="2021��06��11��";
		System.out.println("string���ڸ�ʽ������"+df1.parse(str1));
		SimpleDateFormat dateformatdefine=new SimpleDateFormat("����HH:mm:ss�����ǵ�dd�죬��MM���˰���yyyy��E���G");
		System.out.println("�Զ������ڸ�ʽ����"+dateformatdefine.format(date1));
		
		LocalDateTime t1=LocalDateTime.now();
		//System.out.println("�Զ������ڸ�ʽ��ʹ��ldt��"+dateformatdefine.format(t1));
	} 
}
