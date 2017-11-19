/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júlio
 */
public class Ex2 {
    import java.util.Scanner;
        public class Arrays{
        int[] vet;
        int resultado = 0;
        
    public int soma(){
        for(int i = 0; i< vet.length; i++)
            resultado = resultado + vet[i];
    }
    return resultado;
}
    public static void main (String[] args){
        Scanner entre = new Scanner(System.in);

        Arrays vetor = new Arrays();
        int qt = 0;
        System.out.println("Quantos numeros serao digitados");
        qt = entre.nextInt[qt];

        for ( int i = 0 , i< vetor.vet.lenght; i++){
            System.out.println("Digite a quantidade de numeros + " +(i+1))
                    vetor.vet[i] = entre.nextInt();
                    System.out.println ("Seu resultado é:"+ vetor.soma())
}
