/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júlio
 */
public class Ex12 {
  
    public class void main(String[] args);
    {
        Scanner ent = new Scanner(System.in);
        
        
        int [] vetor = new int[10];
        
        for(int i = 0; i< vetor.length; i++){
            System.out.println("Digite um numero");
            vetor [i] = ent.nextInt();
        }
            for(int i = vetor.length-1; i >= 0; i--){
                System.out.println(vetor[i]);
            }
    }
    
}
