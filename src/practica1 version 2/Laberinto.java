/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica.practica1;
import java.util.Scanner;

/**
 *
 * @author Selvyn
 */
public class Laberinto {

     public static void Escenario1(){
        Scanner lector = new Scanner(System.in);
        
        
        String[][] matriz1 = {
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "|"},
            {"|", "#", " ", " ", " ", " ", " ", " ", "#", "#", " ", " ", " ", " ", " ", " ", " ", "-", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "#", "#", "#", "#", "#", " ", " ", " ", "#", "#", " ", " ", " ", "#", "#", "#", " ", " ", "#", " ", " ", " ", "#", " ", " ", " ", " ", " ", "|"},
            {"|", "#", " ", " ", " ", " ", "#", " ", "#", " ", " ", "#", " ", "#", "#", "#", " ", "#", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", " ", " ", "|"},
            {"|", "#", " ", "#", "#", " ", "#", " ", " ", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", " ", " ", " ", " ", "#", "#", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", "#", " ", " ", "#", " ", "#", "#", "#", "#", "#", "#", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", "#", "#", " ", " ", "#", " ", "|"},
            {"|", "#", " ", "#", "#", " ", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", "#", " ", "#", " ", "#", "#", "|"},
            {"|", "#", "#", " ", " ", " ", "#", " ", "#", " ", "#", " ", " ", " ", " ", " ", "#", " ", "#", "#", " ", "#", "#", "#", "#", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", "#", "#", "#", "#", "#", " ", "#", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", "#", "#", " ", "#", "#", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", " ", "#", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", " ", "#", " ", "#", "#", "#", "#", " ", "|"},
            {"|", "#", "#", "#", " ", "#", " ", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", " ", "#", "#", "#", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", "#", " ", "|"},
            {"|", "#", "#", " ", "#", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", "#", "#", "#", " ", "#", " ", "#", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", " ", "#", " ", "#", "#", " ", "#", " ", " ", " ", " ", " ", "#", " ", " ", "#", " ", " ", "#", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "#", " ", "#", "#", " ", " ", " ", " ", "#", " ", "#", " ", "a", " ", " ", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", " ", "#", " ", "#", "#", " ", " ", " ", "a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "#", " ", " ", " ", "#", "#", "#", " ", "#", " ", " ", "#", "a", " ", " ", " ", "#", " ", " ", "#", " ", " ", " ", " ", " ", "#", "#", " ", "|"},
            {"|", "#", " ", "#", " ", "#", " ", " ", " ", " ", "#", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", " ", " ", " ", " ", " ", "|"},
            {"|", "#", " ", "#", " ", " ", " ", "#", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", "#", " ", "#", " ", " ", "|"},
            {"|", "#", " ", "#", "#", "#", "#", "#", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", " ", " ", "#", " ", "#", "#", "#", "|"},
            {"|", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", "|"},
            {"|", "#", " ", " ", " ", "#", " ", "#", " ", " ", " ", "#", "#", "#", "#", "#", "#", " ", "#", "#", "#", " ", " ", " ", " ", "#", " ", "#", "#", "#", "|"},
            {"|", "#", "#", "#", "#", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", " ", "#", " ", " ", " ", "#", " ", "#", "#", "#", "#", " ", "#", "-", " ", "|"},
            {"|", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", "#", "#", "#", "#", " ", "#", "#", "#", " ", "#", " ", " ", " ", " ", "#", " ", " ", " ", " ", "|"},
            {"|", "#", " ", "#", "#", "#", " ", "#", "#", "#", " ", "#", " ", " ", " ", "#", "#", " ", "#", " ", "#", "#", "#", "-", "#", " ", "#", "#", "#", " ", "S"},
            {"|", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", " ", "#", " ", "#", " ", "-", "-", "-", "-", "#", " ", "#", " ", " ", " ", "|"},
            {"|", "#", " ", "#", "#", "#", "#", "#", "#", "#", "#", " ", "#", " ", "#", "#", "#", " ", "#", " ", "#", "#", "#", "#", "#", " ", "-", " ", " ", "#", "|"},
            {"|", "#", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        
        
         for (String[] matriz11 : matriz1) {
             for (int j = 0; j < matriz1[0].length; j++) {
                 System.out.print(matriz11[j] + "  ");
             }
             System.out.println();
         }
         
         
    }
 //aqui comienza la funcion principal
     public static void main(String[] args){
       
         
         Scanner lector = new Scanner(System.in);
         int opcion;
         int mod = 0;
         
            do{
                Scanner sn = new Scanner (System.in);
                System.out.println("Bienvenido al juego del Laberinto");
                System.out.println("1. Jugar");
                System.out.println("2. Crear Mapa");
                System.out.println("3. Reportes");
                System.out.println("4. Visualizar Mapa");
                System.out.println("5. salir");
                
                System.out.println("Eliga una opcion");
                opcion = sn.nextInt();
                int op;
             switch (opcion) {
                 case 1:
                     System.out.println("Selecciono Jugar");
                     do {
                         
                         System.out.println("1.Laberinto 1");
                         op = sn.nextInt();
                         System.out.println("Buena Suerte");
                         switch (op){
                             case 0:
                                 System.out.println("Adios!");
                                 break;
                             case 1:
                                 Escenario1();
                                 
                                 break;
                             default:
                                 System.out.println("Opcion no valida");
                         }
                     } while(op != 3);
                     break;
                 case 2:
                     System.out.println("Selecciono Crear Mapa");
                     break;
                 case 3:
                     System.out.println("Selecciono Ver Reportes");
                     break;
                 case 4:
                     System.out.println("Selecciono Visualizar Mapas");
                     Escenario1();
                     break;
                 case 5:
                     System.out.println("Selecciono salir del juego");
                     System.out.println("--------Gracias por jugar--------");
                     System.exit(0);
                 default:
                     break;
             }
                
            }while(opcion <= 5);
                
                
         
     }
     
    
     
}// Final //
 
     
     
  