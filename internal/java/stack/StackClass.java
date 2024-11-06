package Stack;
public class StackClass
{
	int top=-1;
	int maxsize=3;
	int s[] = new int[maxsize];
	public void Push (int x)	
	{
		if (top==maxsize-1)
			System.out.println ("Stack Overflow");
		else
		{
			top++;
			s[top]=x;
		}
	}

	public void Pop ()
	{
		if (top==-1)
			System.out.println ("Stack Underflow, Cant Delete");
		else
		{
			System.out.println ("Popping "+s[top]+"\n");
			top--;
		}
	}

	public void display ()
	{
		
		if (top==-1)
			System.out.println ("Stack is empty !!!");
		else
		{
                	System.out.println("\n");
			int i=top;
                	while(i>=0)
	               	{
                        	System.out.print(s[i]+"\t");
                        	i--;
                	}
		}
	}
}
