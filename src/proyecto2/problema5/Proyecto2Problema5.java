/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.problema5;
import java.util.Scanner;
/**
 *
 * @author danii
 * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
 */
public class Proyecto2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        suma();
    
    }
     public static int solicitaentero(String b){
        Scanner key=new Scanner (System.in);
        int a=0;
        boolean flag=true;
        do{
            try{
                System.out.println("Escribe "+b);
                a=key.nextInt();
                flag=false;
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
                
            }
        }
        while(flag);
        return a;
    }
     
     public static int[][] arreglo(String a,int tamano){
        int arreglo[][]= new int [tamano][tamano];
        System.out.println("Arreglo "+a);
      
        for (int i=0; i<arreglo.length;i++){
        for (int j=0;j<arreglo[i].length;j++){
        arreglo[i][j]= solicitaentero("un número entero: ");
        }
        }
        return arreglo;
        }
     
     public static void suma(){
         int suma=0;
        int tamano= solicitaentero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
         int [][]r= new int [a.length][a.length];
         System.out.println("Suma de cada fila");
         for (int i=0;i<a.length;i++){          
           for (int j=0;j<a.length;j++){
               r[i][j]=r[i][j]+a[i][j];
               suma=suma+r[i][j];
               
               
           }  System.out.print("["+suma+"]");
           suma=0;
           
         }
                 
         
     }
    
}
