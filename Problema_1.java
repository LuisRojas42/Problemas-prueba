/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author luis
 */
public class Problema_1 {
    
    int[] solution(int[] a) {
    
        int len = a.length;
        int b[] = new int[len]; 

        for(int i=0; i<len; i++){
            try{
                b[i] = a[i-1] + a[i];      
            }catch(Exception e){
                b[i] = a[i];
            }

            try{
                b[i] = b[i] + a[i+1];      
            }catch(Exception e){

            }

        }

        return b;
    }
    
}
