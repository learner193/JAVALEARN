package packagetest10;

import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Javatest11 {
	public static void main(String[] argv) {
		LocalDateTime d1=LocalDateTime.now();
		DateTimeFormatter df1=DateTimeFormatter.ofPattern("G ����ʱ��HH:mm:ss:n;������Gyyyy��MM��dd�գ�E����Q����,������һ��ĵ�DD�죬��ww��");
		System.out.println("�Զ���ʱ�����ڸ�ʽ����LocalDateTime��\n"+df1.format(d1));
		String str1="2021-06-10-00-00-00";
		DateTimeFormatter df2=DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		LocalDateTime d2=LocalDateTime.parse(str1, df2);
		System.out.println("�Զ���ʱ�����ڸ�ʽ��������LocalDateTime��\n"+df1.format(d2));
	} 
}