import java.io.*;
public class FileWrite
{
    public static void main(String[] args)
    {
        String filename="sample.txt";
        try
        {
           FileWriter fw=new FileWriter(filename);
           fw.write("Hello this is a sample file.\n");
           fw.write("java file handling example");
           fw.close();
           System.out.println("data written to file successfully");
        }
        catch(IOException e)
        {
           System.out.println("Error writing to file"); 
        }
        try
        {
            FileReader fr=new FileReader(filename);
            BufferedReader br =new BufferedReader(fr);

            String line;
            System.out.println("\nReading from file");

            while(( line = br.readLine()) != null )
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("Error readind file");
        }
    }
}