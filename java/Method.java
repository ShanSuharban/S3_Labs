import java.util.Scanner;
class Meth
{
 

	float l,b;
	double r,a;

	void area (float l, float b) {
		this.l=l;
		this.b=b;
		a=l*b;
			
	 }
	 void area (double r)
	 {
		this.r=r;
		a=3.14*r*r;
	 }

	void display () {
		System.out.println ("Area: "+a);
	}
	


}
public class Method {
	public static void main (String [] args)
	{
		float le,br;
		double ra;
		Scanner input = new Scanner (System.in);

		Meth x = new Meth ();
		Meth y = new Meth ();
		System.out.println ("Enter length & breadth: ");
		le=input.nextFloat();
		br=input.nextFloat();
		x.area(le,br);
		x.display ();
		System.out.println ("Enter the radius: ");
		ra=input.nextDouble();
		y.area(ra);
		y.display();	
	}
} 
