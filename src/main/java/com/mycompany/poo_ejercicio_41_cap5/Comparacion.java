/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_41_cap5;
import java.util.ArrayList;
/**
 *
 * @author Luis F Montoya
 */
public class Comparacion {
    double NumMax=0,NumMin=0;
    public double Maximo(ArrayList<Double> Numeros){
        for(int i =0;i< Numeros.size();i++){
            if (i == 0){
                NumMax = Numeros.get(i);
            }
            if (i!=0 && Numeros.get(i)>NumMax){
                NumMax = Numeros.get(i);
            }
            
            
        }
        return NumMax;
        
    }
    public double Minimo(ArrayList<Double> Numeros){
        for(int i =0;i< Numeros.size();i++){
            if (i == 0){
                NumMin = Numeros.get(i);
            }
            if (i!=0 && Numeros.get(i)<NumMin){
                NumMin = Numeros.get(i);
            }
            
            
        }
        return NumMin;
        
    }
  
    
}
