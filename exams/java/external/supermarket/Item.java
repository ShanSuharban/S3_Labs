import java.util.Scanner;

public class Item{
        int item_no;
        String name;
        int price;
        int quantity;
        public int total_stock_value;

        void add(int item_no){
                this.item_no = item_no;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter details of items");
                System.out.print("Enter item name:");
                name = input.nextLine();
                System.out.print("Enter price:");
                price = input.nextInt();
                System.out.print("Enter Quantity:");
                quantity = input.nextInt();
        }

        void calculate(){
                total_stock_value = price*quantity;
        }

        void display(){
                System.out.println(item_no+"\t"+name+"\t"+price+"\t"+quantity+"\t\t\t"+total_stock_value);
        }
}
