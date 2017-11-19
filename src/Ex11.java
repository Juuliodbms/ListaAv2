/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júlio
 */
public class Ex11 {
    public class Main{
        
    public static void main (String[] args);
    {
        int par = 0;
        int impar = 1;
        int soma = 0;
        int multiplica = 1;
        
     while ((par < 30) && (impar < 29))
     {
         par = par +2;
         soma = soma + par;
         impar = impar + 2;
         multiplica = multiplica + impar;
    }
     System.out.println("A soma dos pares é:" + soma);
     System.out.println("A multiplicação dos ímpares é:" + multiplica);
     
     
    }
    
}
