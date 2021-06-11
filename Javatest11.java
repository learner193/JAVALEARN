package packagetest10;

import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Javatest11 {
	public static void main(String[] argv) {
		LocalDateTime d1=LocalDateTime.now();
		DateTimeFormatter df1=DateTimeFormatter.ofPattern("G 现在时间HH:mm:ss:n;现在是Gyyyy年MM月dd日，E，第Q季度,现在是一年的第DD天，第ww周");
		System.out.println("自定义时间日期格式器的LocalDateTime：\n"+df1.format(d1));
		String str1="2021-06-10-00-00-00";
		DateTimeFormatter df2=DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		LocalDateTime d2=LocalDateTime.parse(str1, df2);
		System.out.println("自定义时间日期格式器解析的LocalDateTime：\n"+df1.format(d2));
	} 
}