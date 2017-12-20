/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso
 */
public class ProgramaExamen {
    
    public void Ejercicio1(){
    int n=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero de elementos a sumar: "));
    int[] Arreglo=new int[n];
    int suma=0;
    for(int i=0; i<n; i++){
        
        Arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(i+"  Ingrese el elemento"));
    }
    for (int j=0;j<n;j++){
        suma = suma + Arreglo[j];
    }
    JOptionPane.showMessageDialog(null,"La suma de los elementos es: "+ suma);
    }
    
    public void Ejercicio2(){
    
        String[] nombres;
        nombres=new String[5];
        int[] edad= new int[5];
        for(int f=0;f<nombres.length;f++) {
            nombres[f]=JOptionPane.showInputDialog("Ingrese el nombre ");
            edad[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        } 
        
       
    for(int j=0;j<edad.length;j++)
    {
        if(edad[j]>17)
        {
            JOptionPane.showMessageDialog(null,"Es mayor de edad: "+ nombres[j] + " " + edad[j]+ " años");
        } 
    }
    }
    
    public void Ejercicio3(){
        int n=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el numero de elementos"));
        int[] vector=new int[n];
        
        for (int i =0; i<n; i++) {
        vector[i]=Integer.parseInt(JOptionPane.showInputDialog(i+"  Ingrese el elemento"));


        }
        int menor;
        menor=vector[0];
         for(int j=1;j<n;j++)
        {
            if(vector[j]<menor){
            menor=vector[j];
            }
        }JOptionPane.showMessageDialog(null,"El elemento menor es: "+ menor);
            
        Arrays.sort(vector);
        for(int i = 1; i < vector.length; i++) {
            if(vector[i] == vector[i - 1]) { 
            JOptionPane.showMessageDialog(null,"Se repite el numero: " + vector[i]); 
            }
        }
    }
    
    public void Ejercicio4(){
        String[] pais;
        pais=new String[5];
        for(int i=0;i<pais.length;i++) {
            pais[i]=JOptionPane.showInputDialog("Ingrese el pais ");
        }
        Arrays.sort(pais); 
         
        JOptionPane.showMessageDialog(null,"Los paises en orden alfabetico son:\n"+Arrays.toString(pais));
    }
    
    public void Ejercicio5(){
        String[] alumno;
        alumno=new String[5];
        int[] nota= new int[5];
        for(int i=0;i<alumno.length;i++) {
            alumno[i]=JOptionPane.showInputDialog("Ingrese el alumno ");
            nota[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
        }
        Arrays.sort(nota);
        for(int i =nota.length-1; i>=0; i--){
        JOptionPane.showMessageDialog(null,nota[i]+" "+alumno[i]);
        }
    }
    
    public void Ejercicio6(){
        String[] pais;
        pais=new String[5];
        int[] habitantes;
        habitantes = new int[5];
        for(int i=0;i<pais.length;i++) {
            pais[i]=JOptionPane.showInputDialog("Ingrese el pais ");
            habitantes[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de habitantes"));
        }
        Arrays.sort(pais); 
        JOptionPane.showMessageDialog(null,"Los paises en orden alfabetico son:\n"+Arrays.toString(pais));
        Arrays.sort(habitantes);
        for(int i =habitantes.length-1; i>=0; i--){
            JOptionPane.showMessageDialog(null,habitantes[i]+"habitantes "+pais[i]);
        }
    }
    
    public void menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("1.-Ejercicio 1 (suma de un arreglo)\n"
               + "2.- Ejercicio 2 (mayores o iguales a 18 años)\n"
               + "3.- Ejercicio 3 (menor y repetitivos)\n"
               + "4.- Ejercicio 4 (orden alfabetico)\n"
               + "5.- Ejercicio 5 (mayor a menor)\n"
               + "6.- Ejercicio 6 (orden alfabetico y mayor a menor)\n"
               + "7.- Salir"));
            switch(op){
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
            }
        }while (op!=7);
    }
}


            
   
    

