
public class StaticConcept {
	 static int s;
	 
	 int a;
	 int b;
	 
	 public static void main(String args[]) {
		 
		 StaticConcept sc0 = new StaticConcept();
		 StaticConcept sc1 = new StaticConcept();
		 
		 sc0.s = 1;
		 sc0.a = 2;
		 sc0.b = 3;
		 
		 sc1.s = 10;
		 sc1.a = 20;
		 sc1.b = 30;
		 
		 System.out.println("sc0:"+sc0.s+","+sc0.a+","+sc0.b);
		 System.out.println("sc1:"+sc1.s+","+sc1.a+","+sc1.b);
	 
	 }
}
