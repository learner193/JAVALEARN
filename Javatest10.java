package packagetest10;

import java.text.*;
import java.util.*;
import java.time.*;

public class Javatest10 {
	public static void main(String[] argv) throws ParseException {
		Date date1=new Date();
		DateFormat df1full=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("全日期格式"+df1full.format(date1));
		
		Instant now=Instant.now();
		System.out.println("jdk8日期："+now);
		System.out.println("旧日期："+date1);
		DateFormat longformat=DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("长日期格式器"+longformat.format(date1));
		
		DateFormat mediumformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("全日期格式器返回值："+DateFormat.FULL);
		System.out.println("长日期格式器返回值："+DateFormat.LONG);
		System.out.println("中日期格式器返回值："+DateFormat.MEDIUM);
		System.out.println("中日期格式器："+mediumformat.format(date1));
		DateFormat df1=DateFormat.getDateInstance();
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);
		String str1="2021年06月11日";
		System.out.println("string日期格式器解析"+df1.parse(str1));
		SimpleDateFormat dateformatdefine=new SimpleDateFormat("现在HH:mm:ss今天是第dd天，第MM月了啊啊yyyy年E年代G");
		System.out.println("自定义日期格式器："+dateformatdefine.format(date1));
		
		LocalDateTime t1=LocalDateTime.now();
		//System.out.println("自定义日期格式器使用ldt："+dateformatdefine.format(t1));
	} 
}
