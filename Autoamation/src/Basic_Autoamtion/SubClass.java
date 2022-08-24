package Basic_Autoamtion;

public class SubClass extends SuperClass  {

	   public static void sample(){
		      System.out.println("Method of the sub class");
		   }
		   public static void main(String args[]){
		      SuperClass obj1 = new SubClass();
		      SubClass obj2 = new SubClass();
		      obj1.sample();
		      obj2.sample();
		   }
		}
