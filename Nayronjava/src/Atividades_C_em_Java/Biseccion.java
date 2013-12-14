/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Atividades_C_em_Java;

/**
 *
 * @author Nayron
 */

/**
 *
 * @author fredy Mosquera Lemus
 */
public class Biseccion {
 
    /**
    * Este metodo crea un funcion a la cual se le aplicara el método de
    * Biseccion teniendo como parametro de entrada un double x, el cual
    * sirve para la construccion de la funcion dentro del metodo
    * @param x
    * @return
    */
   private double funcion(double x){
       // return Math.sqrt( x*x +1 ) -4;
        return (x*x*x) - 9 * x +3;
    }
    /**
     * Metodo de Biseccion el cual le halla las raices de una funciones en un intervalo
     * ingresado como  parametro de entrada [a, b] y un el error con el cual
     * deseamos hallar nuestra funcion
     * @param a
     * @param b
     * @param error
     * @return
     */
    public double metodoDeBiseccion(double a, double b, double error){
        double c = 0.0;
        double fa;
        int contador = 0;
        double fb;
        double fc;
        if((funcion(a) * funcion(b)) > 0){
            System.out.println("Error en el intervalo, en ese intervalo no existen raices");
        }else{
             c = (a + b) /(double) 2;
            do{
 
                fa = funcion(a);
                fb = funcion(b);
                fc = funcion(c);
                if((fa * fc) > 0){
                    a = c;
                    fa = funcion(a);
                    fb = funcion(b);
                     c = (a + b) /(double) 2;
                    fc = funcion(c);
                    contador = contador+1;
                    
                }else if((fb * fc) > 0 ){
                    b = c;
                    fa = funcion(a);
                    fb = funcion(b);
                     c = (a + b) /(double) 2;
                    fc = funcion(c);
 
                }
 
 
             
            }while(Math.abs(fc) >= error);
        }
        System.out.println("valor de la funcion: "+funcion(c));
        System.out.println(contador);
        return  c;
      
 
    }
   
 
 
}