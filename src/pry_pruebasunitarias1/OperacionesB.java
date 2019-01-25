/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_pruebasunitarias1;

/**
 *
 * @author DELL
 */
public class OperacionesB {
    float num1;
     float num2;
     float result;
    public float Suma(float num1,float num2){
        result=(float) (num1+num2);
        System.out.println("LA SUMA ES:"+result);
        return result;
    }
    public float Restar(float num1,float num2){
        result=(float) (num1-num2);
         System.out.println("LA RESTA ES:"+result);
        return result;
    }
    public float Multiplicar(float num1,float num2){
        
        result=(float) (num1*num2);
         System.out.println("LA MULTIPLICACION ES:"+result);
        return result;
    }
    public float Dividir(float num1,float num2){
        
        result=(float) (num1/num2);
         System.out.println("LA LA DIVISION ES:"+result);
        return result;
    }
}
