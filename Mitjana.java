public class Mitjana 
{
    public static void main(String[] args) 
    {
        String nombre = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int c = Integer.parseInt(args[3]);
        int media = (a + b + c) / 3;
        
        try 
        {
             System.out.println(nombre + " tus notas son: ");
             System.out.println("1era Evaluacion: " + a);
             System.out.println("2a Evaluacion: " + b);
             System.out.println("3a Evaluacion: " + c);
             System.out.println("Media de la evaluacion: " + media);
        }
          catch(Exception e) 
          {
            System.out.println("Introduce tu nombre y las notas de tu evaluación");
          }
    }
}