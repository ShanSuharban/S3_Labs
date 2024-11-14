import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                Item I[] = new Item[100];
                int n = 0,choice;

                System.out.println("1.Add Item\t2.Calculate Stock Value\t3.Display");
                do{
                        System.out.println("Enter your choice:");
                        choice = input.nextInt();
                        switch(choice){
                                case 1:
                                        I[n] = new Item();
                                        I[n].add(n);
                                        n = n+1;
                                        break;
                                case 2:
                                        for(int i =0; i<n;i++)
                                                I[i].calculate();
                                        System.out.println("Stock Value calculated!");
                                        break;
                                case 3:
                                        if(n == 0){
                                                System.out.println("Items are not added!");
                                                break;
                                        }
                                        for(int i = 0; i< n; i++){
                                                for(int j = 0; j<i; j++){
                                                    if(I[i].price < I[j].price){
                                                    Item temp = I[i];
                                                    I[i] = I[j];
                                                    I[j] = temp;
                                                    }
                                                }
                                        }
                                        System.out.println("ITEM_NO\tNAME\tPRICE\tQUANTITY\tTOTAL_STOCK_VALUE");
                                        for(int i = 0; i<n; i++)
                                                I[i].display();
                                        break;
                                case 4:
                                        System.out.println("Exiting");
                                        break;
                                default:
                                        System.out.println("Invalid Input!");
                        }
                }while(choice != 4);

        }
}
