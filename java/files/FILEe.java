import java.io.File;
import java.io.IOException;
public class FILe
{
        public static void main(String[] args)
        {
                try
                {
                        File f = new File("TestDemo.txt");
                        boolean value = f.createNewFile();
                        if(value)
                                System.out.println("File created successfully");
                        else
                                System.out.println("File not created");
                        System.out.println("Filepath: "+f.getAbsolutePath());
                }
                catch(IOException e)
                {
                        System.out.println(e);
                }
        }
}
