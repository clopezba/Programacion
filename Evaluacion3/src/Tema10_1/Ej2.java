package Tema10_1;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ej2 {

	public static void main(String[] args) {
		
		int a�o, mes, dia, hora, min, seg;
		
		//a-java.util.Date
		Date hoy = new Date();
		a�o = hoy.getYear() +1900;
		mes = hoy.getMonth()+1;
		dia = hoy.getDate();
		hora = hoy.getHours();
		min = hoy.getMinutes();
		seg = hoy.getSeconds();
		System.out.println("Date: " + a�o + " - " + mes + " - " + dia + " - " + 
			hora + " - " + min + " - " + seg);

		//b-GregorianCalendar
		GregorianCalendar gchoy = new GregorianCalendar();
		a�o = gchoy.get(Calendar.YEAR);
		mes = gchoy.get(Calendar.MONTH)+1;
		dia = gchoy.get(Calendar.DAY_OF_MONTH);
		hora = gchoy.get(Calendar.HOUR_OF_DAY);
		min = gchoy.get(Calendar.MINUTE);
		seg = gchoy.get(Calendar.SECOND);
		System.out.println("GregorianCalendar: " + a�o + " - " + mes + " - " + dia + " - " + 
			hora + " - " + min + " - " + seg);

		//c-java.time
		LocalDateTime ldhoy = LocalDateTime.now();
		a�o = ldhoy.getYear();
		mes = ldhoy.getMonthValue();
		dia = ldhoy.getDayOfMonth();
		hora = ldhoy.getHour();
		min = ldhoy.getMinute();
		seg = ldhoy.getSecond();
		System.out.println("LocalDateTime: " + a�o + " - " + mes + " - " + dia + " - " + 
				hora + " - " + min + " - " + seg);
		
	
	}

}
