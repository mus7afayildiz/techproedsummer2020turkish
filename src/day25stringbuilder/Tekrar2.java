package day25stringbuilder;

public class Tekrar2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		String sub1 = sb.substring(3);
		System.out.println(sub1);
		
		String sub2 = sb.substring(2, 5);
		System.out.println(sub2);
		
		sb.indexOf("n");
		
		int lng = sb.length();
		System.out.println(lng);
		
		char ch = sb.charAt(6);
		System.out.println(ch);
		
		StringBuilder ab1 = new StringBuilder();
		ab1.append('A').append('b');
		System.out.println(ab1);
		
		StringBuilder ab2 = new StringBuilder().append('A');
		ab2.append('b').append('c');
		System.out.println(ab2);
		
		StringBuilder ab3 = new StringBuilder("animal");
		ab3.insert(0, "X");
		System.out.println(ab3);
		ab3.insert(7, "X");
		System.out.println(ab3);
		ab3.insert(4, "X");
		System.out.println(ab3);
		
		StringBuilder sb1 = new StringBuilder("abcdef");
		sb1.delete(1, 3);
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("abcdef");
		sb2.deleteCharAt(2);
		System.out.println(sb2);
		sb2.deleteCharAt(4);
		
		StringBuilder sb3 = new StringBuilder("abc");
		sb3.reverse();
		System.out.println(sb3);
		sb3.toString();
		
		
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		total += letters.substring(6, 6).length();
		System.out.println(total);
	}

}
