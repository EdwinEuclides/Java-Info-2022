/*
    7. Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo 
       a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra en minúscual: ");
        String sMin = sc.next();
        sc.close();
        
       char[] chArr = sMin.toCharArray();
       char[] chArrMay = new char[chArr.length];
          
        for(int i=0;i<chArr.length;i++){
            char c = chArr[i];
           
            if(c<121 && c>96)
                chArrMay[i]=(char)(c-32);
            else
                chArrMay[i]=c;
        }

        String sMay = new String(chArrMay);
        System.out.println(sMay);
    }
    
}
