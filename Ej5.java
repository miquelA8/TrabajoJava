import java.io.*;
import java.util.Scanner;

public class Ej5 
{
    PrintWriter pw;

    public Ej5(String nomArxiu)
    {
        try 
        {
            pw = new PrintWriter(new File(nomArxiu +".txt"));
        }
        catch(FileNotFoundException fnfe)
        {
            System.err.println(fnfe.getMessage());
        }
        finally
        {
            pw.close();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Ej5 abba = new Ej5(name);
    }
    
}