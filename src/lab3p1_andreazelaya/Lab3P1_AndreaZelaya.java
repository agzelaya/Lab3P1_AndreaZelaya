package lab3p1_andreazelaya;
import java.util.Scanner;

public class Lab3P1_AndreaZelaya {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int opcion;
        do{
        System.out.println("MENU");
        System.out.println("1. Diptongo");
        System.out.println("2. Sumatoria Pi");
        System.out.println("3. Time Clock");
        System.out.println("4. Salida");
        System.out.print("Ingrese su opcion: ");
        opcion = in.nextInt();
        System.out.println();
        
        switch (opcion){
            case 1: {
                System.out.println("Diptongo en proceso");
                System.out.println("Ingrese una palabra: ");
                String word = in.next().toLowerCase();
                char letrai = 0, letraj = 0;
                int cont = 0;
                
                for (int i = 0; i < word.length(); i++) {
                    letrai = word.charAt(i); 
                    if (i + 1 < word.length()){
                    letraj = word.charAt(i + 1);
                        if (letrai == 'a' || letrai == 'e' || letrai == 'i' || letrai == 'o' || letrai == 'u'){
                            if (letraj == 'a' || letraj == 'e' || letraj == 'i' || letraj == 'o' || letraj == 'u'){
                                cont++;
                             }// fin if interno
                            else {
                                
                             }// fin else
                          }// fin if externo  
                    }//fin if 
                }//fin for
                if (cont >= 1) {
                    System.out.println("La palabara es un diptongo");   
                }
                else{
                    System.out.println("La palabra no es un diptongo");
                }
            }// fin case 1
            break;
            
            case 2: {
                System.out.println("Sumatoria en proceso");
                System.out.print("Ingrese un numero limite: ");
                double limite = in.nextInt(), calculo2 = 0, acum = 0;
                
                if (limite < 0){
                    System.out.println("Ingrese un numero mayor a 0");
                    System.out.println();
                }// fin validacion
                
                else{
                for (int i = 0; i < limite; i++) {
                    double calculo1 = Math.pow(-1, i);
                    calculo2 = 2*i +1;
                    double division = calculo1 / calculo2;
                    acum = acum + division;
                }// fin for
                
                double resultado = 4 * acum;
                System.out.println("Resultado: " + resultado);
                }// fin else
                
            }// fin case 2
            break;
           
            case 3:{
                System.out.println("Time clock");
                System.out.print("Ingrese un tamaño impar: ");
                int size = in.nextInt();
                
                if (size%2 == 0){
                    System.out.println("Ingrese un numero par");
                }
                
                
                else{
                for (int i = 0; i <= size/2; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                         }
                        for (int j = 1 ; j <= size-2*i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                }// fin for
                
                    for (int i = 0; i < size/2+1; i++) {
                        if (i > 0){
                            for (int j = 1 ; j <= (size/2 + 1) - (i+1); j++) {
                            System.out.print(" ");
                            }
                            for (int x = 0; x < i + (i+1); x++) {
                            System.out.print("*");
                            }
                            System.out.println();
                        }// fin if
                      
                    }//fin for
                }// fin else
            }// fin case 3
            
        }// fin switch
        
        
        System.out.println();
        }while (opcion != 4);
    }//fin main method
    
}// 
