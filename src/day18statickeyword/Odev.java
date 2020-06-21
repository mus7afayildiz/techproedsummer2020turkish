package day18statickeyword;

public class Odev {
//	//1- 
//	
//	class Counter{
//		int count = 0;
//		Counter(){
//			count++;
//			System.out.println(count);
//		}
//		
//	
//
//	public static void main(String[] args) {
//		Counter c1=new Counter();
//		Counter c2=new Counter();
//		Counter c3=new Counter();
//
//	}

	
//	//2-
//	class Student{
//		int number;
//		String name;
//		static String college ="ITS";
//		Student(int r, String n, String college){
//		number = r;//static olmadýðý için compile time error verir
//		name = n;//static olmadýðý için compile time error verir
//		college = college;
//		}
//		public static void main(String args[]){//value lar static olmadýðý için compile time error verir
//		Student s1 = new Student(111,"Karan", "MIT");
//		Student s2 = new Student(222,"Aryan", "Harvard");
//		System.out.println(s1.number);
//		System.out.println(s2.number);
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s1.college);
//		System.out.println(s2.college);	}		}
	
	
	//3-
	
//	public class MyClass{
//		int x = 3;
//		int y = 5;
//		
//		MyClass(){
//			x+=1;
//			System.out.println("-x"+x);
//		}
//		MyClass(int i){
//			this();
//			this.y = i;
//			x+=y;
//			System.out.println("-x"+x);
//		}
//		MyClass(int i, int i2){
//			this(3);
//			this.x-=4;
//			System.out.println("-x"+x);
//		}
////		public static void main(String[] args) {
//			MyClass mc1 = new MyClass(4,3);
//		}	
		
	
	//4-
	
//	class Test1{
//		public static void main(String[] args) {
//			int x = 20;
//			System.out.println(x);
//		}
//		static {
//			int x - 10;
//			System.out.println(x + " ");
//		}
//	}
		
	
	
	//5-
	
//	class Test1{
//		int x = 10;
//		public static void main(String[] args) {
//			System.out.println(x);
//		}
//		static {
//			
//			System.out.println(x + " ");
//		}
//	}
	
	
//	//6-
//	
//	class Test1{
//	int x = 10;
//	public static void main(String[] args) {
//		Test1 t1 = new Test1();
//		System.out.println(t1.x);
//	}
//	static {
//		int x = 20;
//		System.out.println(x + " ");
//	}
//}
	
	
	//7-
	
//	class Test1{
//	int x = 10;
//	public static void main(String[] args) {
//		
//		System.out.println(Test1.x);
//	}
//	static {
//		int x = 20;
//		System.out.println(x + " ");
//	}
//}
	
	
	//8-
	
//	class Test1{
//		static int x = 10;
//	public static void main(String[] args)
//	{
//			Test1 t1 = new Test1();
//			Test1 t2 = new Test1();
//			
//			t1.x = 20;
//			System.out.println(t1.x+" ");
//			System.out.println(t2.x);
//	}
//		
//	}
	
	
	
	
	
	}
	
	
	
