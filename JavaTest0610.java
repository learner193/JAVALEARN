package packageTest9;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.time.YearMonth;
import java.time.ZoneId;

public class JavaTest0610 {

	public static void main(String[] argv) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-12.2113));
		System.out.println(Math.floor(2.9323));
		System.out.println(Math.pow(2, 2.5));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.round(-9.8));
		System.out.println(Math.round(-3.2));
		System.out.println(Math.random());
		
		Random r1=new Random();
		System.out.println(r1);
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		
		Integer a;
		int b=10;
		a=b;
		System.out.println(a+" "+b);
		System.out.println(a.toString());
		String str=String.valueOf(2112132);
		System.out.println(str);
		a=a+Integer.parseInt(str);
		System.out.println(a);
		double q;
		q=23.5+Double.parseDouble("12.2313444444432212");
		System.out.println(q);
		Date today=new Date();
		System.out.println(today);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		cal.get(Calendar.DATE);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		cal.add(Calendar.HOUR, 20);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		Calendar cal2=Calendar.getInstance();
		//cal2.set(Calendar.DATE, 31);
		System.out.println("claclaclaclacal"+cal2.get(Calendar.DATE));
		System.out.println(cal2.get(Calendar.MONTH));
		
		//cal2.setLenient(false);
		//cal2.set(Calendar.DATE, 50);
		System.out.println(cal2.getTime());
		
		long ti=System.currentTimeMillis();
		
		Clock clo=Clock.systemUTC();
		System.out.println(clo.millis());
		System.out.println(clo.instant());
		Duration dura=Duration.ofDays(21);
		System.out.println(dura.toDays());
		System.out.println(dura.toMinutes());
		
		long tw=System.currentTimeMillis();
		System.out.println(tw-ti);
		
		Instant ins1=Instant.MAX;
		System.out.println(ins1);
		ins1=Instant.now();
		System.out.println(ins1);
		ins1=ins1.plusSeconds(100000000);
		System.out.println(ins1);
		System.out.println(ins1.plusMillis(30));
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		ld=ld.plusDays(12).plusYears(1);
		System.out.println(ld);
		ti=ld.getMonthValue();
		System.out.println(ti);
		
		Month mo=Month.APRIL;
		System.out.println(mo);
		java.time.YearMonth ym=YearMonth.now();
		System.out.println(ym);
		ym.getYear();
		System.out.println(ym.getYear());
		
		ZoneId zi=ZoneId.systemDefault();
		System.out.println(zi);
		
		Instant time1=Instant.now();
		System.out.println("Instant表示的现在时间"+time1);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("LocalDatetime表示的现在时间"+ldt+"adddddd");				
	}
}
