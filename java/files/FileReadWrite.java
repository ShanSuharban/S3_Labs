import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FileReadWrite
{
        public static void main(String[] args)
        {
                String f = "sample.txt"; 
                try (FileWriter fw = new FileWriter(f)){
                        fw.write("Java is a high-level, class-based, object-oriented programming language ");
                        System.out.println("sample.txt file created successfully.");
                }
                 catch (IOException e) {
                        System.out.println("An error occurred while creating the file: " + e);
                }
                try(FileReader fr = new FileReader(f)) 
                {
                        int c;
                        while((c=fr.read())!=-1)
                        {
                                System.out.print((char)c);
                        }
                }
                catch(IOException e)
                {
                        System.out.println("Exception "+e+" occured");
                }
        }
}
