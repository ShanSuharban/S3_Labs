import java.util.Scanner;
class Complex {
	int real,img;
	void Read () {
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter the real part of complex 1: ");
		real=input.nextInt();
		System.out.println ("Enter the img part of complex: ");
		img=input.nextInt();
	}		
		Complex Calc (Complex n2) {
			Complex n3 = new Complex ();
			n3.real=real+n2.real;
			n3.img=img+n2.img;
			return n3;
		}
		void display () {
			System.out.println (" "+this.real+"+i"+this.img+" ");
		}
}

public class ComplexAdd {
		public static void main (String [] args ) {
			Complex c1 = new Complex ();
			Complex c2 = new Complex ();
			
			c1.Read();
			c2.Read();
			Complex c3 = c1.Calc (c2);
			c3.display ();	
		} 
		

}

