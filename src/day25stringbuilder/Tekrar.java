package day25stringbuilder;

public class Tekrar {

	public static void main(String[] args) {
		String str = "Ali";
		str.substring(1);
		System.out.println(str.substring(1));
		
		StringBuilder strBldr = new StringBuilder("Ayþe");
		System.out.println(strBldr);
		strBldr.append(" Ahmet");
		System.out.println(strBldr);
		
		StringBuilder strBldr2 = new StringBuilder("animals");
		String a = strBldr2.substring(3);
		System.out.println(a);
		
		System.out.println(strBldr2.substring(1, 4));
		
		System.out.println(strBldr2.indexOf("i"));
		
		System.out.println(strBldr2.length());
		
		System.out.println(strBldr2.charAt(4));
		
		System.out.println(strBldr2.insert(0, "big "));
		
		System.out.println(strBldr2.delete(0, 7));
		
		System.out.println(strBldr2.deleteCharAt(2));
		
		System.out.println(strBldr2.reverse());
		
		System.out.println(strBldr2.insert(3, " yeli"));
		
		System.out.println(strBldr2.toString());
		
		
		 
	}

}
