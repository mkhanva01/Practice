package Basic_Autoamtion;

public class Overloading {

	public static void add(int a, int b){
	      System.out.println(a+b);
	   }
	   public static void add(int a, int b, int c){
	      System.out.println(a+b+c);
	   }
	   public static void main(String args[]){
		   Overloading obj = new Overloading();
	      obj.add(20, 40);
	      obj.add(40, 50, 60);
	     
	   }
	}
