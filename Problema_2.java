/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author luis
 */
public class Problema_2 {
    
    int solution(String pattern, String source) {
    
        int cont = 0;
        int len_source = source.length();
        int len_patters = pattern.length();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        boolean fin = false;

        for (int i = 0; i < len_source - len_patters + 1; i ++){

            for (int j = 0; j < len_patters; j++){

                System.out.println(source.charAt(i+j) + " " + (i+j) +" - " + pattern.charAt(j));

                if ( check(vowels, source.charAt(i+j)) && !(pattern.charAt(j) == '0') ){
                    System.out.println("br");
                    fin = false;
                    break;
                }
                if ( !(check(vowels, source.charAt(i+j))) && !(pattern.charAt(j) == '1') ){
                    System.out.println("br");
                    fin = false;
                    break;
                }
                fin = true;
            }

            if (fin) {
                cont ++;
                System.out.println("pl");
            }

        }

        return cont;

    }

    private static boolean check(char[] arr, char toCheckValue)
    {

        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }

        return test;
    }

    
}
