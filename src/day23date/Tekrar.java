package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Tekrar {

	public static void main(String[] args) {
		System.out.println("Date01------------------------");
		
		// Bugunun tarihini ekrana yazdiralim
		System.out.println(LocalDate.now());
		
		// Bugunun zamanini saat, dakika, saniye ve salise olarak ekrana yazdiralim
		System.out.println(LocalTime.now());
		
		// Bugunun tarihini ve zamanini ekrana yazdiralim
		System.out.println(LocalDateTime.now());
		
		System.out.println("Date02------------------------");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(1));
		System.out.println(date.minusMonths(5));
		System.out.println(date.minusYears(3));
		
		System.out.println(date.plusDays(3));
		System.out.println(date.plusWeeks(1));
		System.out.println(date.plusMonths(5));
		System.out.println(date.plusYears(3));
		
		
		System.out.println("Date03------------------------");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.plusHours(2));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(30));
		
		System.out.println(time.minusHours(3));
		System.out.println(time.minusMinutes(20));
		System.out.println(time.minusSeconds(6));
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		
		System.out.println("Date04------------------------");
		
		LocalDate date2 = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf.format(date2));
		
		LocalTime time2 = LocalTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf1.format(time2));
		
		
		System.out.println("ListAllMethod------------------------");
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(9);
		list1.add(8);
		list1.add(7);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		list.addAll(1, list1);
		System.out.println(list);
		
	}

}
