import java.util.Scanner;
public class Sueldo 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de horas que trabajas a la semana:");
        int horas = sc.nextInt();
        System.out.println("Introduce la cantidad de dias que trabajas a la semana:");
        int dias = sc.nextInt();
        System.out.println("Introduce a cuanto cobras las horas:");
        int shoras = sc.nextInt();

        int total = (horas * shoras) * dias;
        System.out.println();
        System.out.println("Tu salario total sera de: " + total + "$");
    }
    
}