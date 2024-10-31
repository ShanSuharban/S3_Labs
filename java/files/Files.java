import java.io.*;
class Files
{
        public static void main(String args[])
        {
                try
                {
                        int lines=0,chars=0,words=0;
                        int code=0;
                        FileInputStream f = new FileInputStream("sample.txt");
                        while(f.available()!=0)
                        {
                                code = f.read();
                                if(code!=10)
                                chars++;
                                if(code==' ')
                                words++;
                                if(code=='.')
                                {
                                        lines++;
                                        words++;
                                }
                        }
                        System.out.println("No.of characters = "+chars);
                        System.out.println("No.of words = "+(words));
                        System.out.println("No.of lines = "+(lines));
                        f.close();
                }
                catch(FileNotFoundException e)
                {
                        System.out.println("Cannot find the specified file...");
                }
                catch(IOException i)
                {
                        System.out.println("Cannot read file...");
                }
        }
}

