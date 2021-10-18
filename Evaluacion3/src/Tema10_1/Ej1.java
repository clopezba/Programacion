package Tema10_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.time.LocalDate;


public class Ej1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el d�a: ");
		int dia = s.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = s.nextInt();
		System.out.println("Introduce el a�o: ");
		int a�o = s.nextInt();
		
		//con la clase Fecha
		Fecha f = new Fecha(dia, mes, a�o);
		System.out.println(f.diaSemana());
		
		//b-con clase java.util.Date
		Date fe = new Date();
		System.out.println("D�a:");
		fe.setDate(s.nextInt());
		System.out.println("Mes:");
		fe.setMonth((s.nextInt()-1));
		System.out.println("A�o:");
		fe.setYear(s.nextInt()-1900);
		System.out.println(fe.getDay());
		
		//c-java.util.GregorianCalendar
		GregorianCalendar fec = new GregorianCalendar();
		System.out.println("D�a:");
		fec.set(Calendar.DATE, s.nextInt());
		System.out.println("Mes:");
		fec.set(Calendar.MONTH, (s.nextInt()-1));
		System.out.println("A�o:");
		fec.set(Calendar.YEAR, s.nextInt());
		System.out.println(fec.get(Calendar.DAY_OF_WEEK)-1);
		
		//d-java.time
		System.out.println("A�o: ");
		int anyo = s.nextInt();
		System.out.println("Mes:");
		mes = s.nextInt();
		System.out.println("D�a:");
		dia=s.nextInt();
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		System.out.println(fecha.getDayOfWeek().getValue());
		
		s.close();
	}
}
