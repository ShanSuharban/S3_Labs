import java.util.Scanner;
interface Queue
{
        public void insert(int x);
        public void delete();
        public void display();
}
class Test implements Queue
{
        int front=-1,rear=-1;
        int Maxsize=5;
        int[] q=new int[Maxsize];
        public void insert(int x)
        {
                if(rear==Maxsize-1)
                        System.out.println("Queue overflow");
                else if(front==-1)
                {
                        front=rear=0;
                        q[rear]=x;
                }
                else
                {
                        rear++;
                        q[rear]=x;
                }
        }
        public void delete()
        {
                if(front==-1)
                        System.out.println("Queue Empty");
                else if(front==rear)
                {
                        System.out.println(q[front]+"is deleted");
                        front=rear=-1;
                }
                else
                {
                        System.out.println(q[front]+"is deleted");
                        front++;
                }
        }
        public void display()
        {
                int i;
                if(front==-1)
                        System.out.println("Queue Empty");
                else
                {
                        for(i=front;i<=rear;i++)
                        {
                                System.out.println(q[i]+" ");
                        }
                }
        }
}
public class Interface
{
        public static void main(String[] args)
        {
                int x,c=0;
                Scanner input=new Scanner(System.in);
                Test t=new Test();
                System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
                do{
                        System.out.println("Enter your choice:");
                        c=input.nextInt();
                        switch(c)
                        {
                                case 1:System.out.println("Enter element to be inserted:");
                                        x=input.nextInt();
                                        t.insert(x);
                                        break;
                                case 2:t.delete();
                                        break;
                                case 3:t.display();
                                        break;
                                case 4:System.exit(0);
                                default:System.out.println("Invalid Choice");
                        }
                }while(c!=4);
        }
}
