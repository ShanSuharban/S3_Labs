
import Stack.StackClass;
import java.util.Scanner;
public class StackMain extends StackClass
{
	public static void main (String[] args)
	{
		int choice=0,n;
		Scanner input = new Scanner (System.in);
		StackClass s = new StackClass ();

		do 
		{
			//StackClass s = new StackClass ();
			System.out.println ("\n\n 1.Push \n 2.Pop \n 3.Display \n 4.Exit \n Enter your choice: ");
			choice=input.nextInt();
			switch (choice)
			{
				case 1:
					System.out.println ("Enter value to push : ");
					n=input.nextInt();
					s.Push(n);
					break;
				case 2:
					s.Pop();
					break;

				case 3:
					s.display();
					break;

				case 4:
					
					break;
				default:
					System.out.println ("Invalid Choice !!!");

			
			}
		} while (choice!=4); 
	}
}
