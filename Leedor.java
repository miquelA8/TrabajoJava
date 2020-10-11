import java.io.*;
import java.util.Scanner;

public class Leedor 
{
    Scanner sc = new Scanner(System.in);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader (isr);
    public Leedor()
    {
        normi(br);
        numerito(br);
        flotador(br);
        doublecito(br);
               
    }

    
    public void numerito(BufferedReader br)
    {
        try
        {
            System.out.println("Introduce un numero entero");
            int s1 = Integer.parseInt(br.readLine());
        }
        
        catch (Exception e)
        {
            System.out.println("Debes de introducir un número entero para el correcto funcionamiento del programa");
            numerito(br);
        }
        
    }

    public void doublecito(BufferedReader br)
    {
        try
        {
            System.out.println("Introduce un numero decimal");
            double d1 = Double.parseDouble(br.readLine());
        }
        
        catch (Exception e)
        {
            System.out.println("Debes de introducir un numero decimal para el correcto funcionamiento del programa");
            doublecito(br);
        }
        
    }
    public void flotador(BufferedReader br)
    {
        try
        {
            System.out.println("Introduce un float");
            float d1 = Float.parseFloat(br.readLine());
        }
        
        catch (Exception e)
        {
            System.out.println("Debes de introducir un float para el correcto funcionamiento del programa");
            flotador(br);
        }
        
    }

    public void normi(BufferedReader br)
    {
        try
        {
            System.out.println("Introduce una cadena de caracteres");
            String d1 = br.readLine();
        }
        
        catch (Exception e)
        {
            System.out.println("Debes de introducir una cadena de caracteres para el correcto funcionamiento del programa");
            normi(br);
        }
        
    }

    public static void main(String[] args) 
    {
        Leedor ld = new Leedor();
        
    }
    
}