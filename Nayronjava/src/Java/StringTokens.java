/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Nayron
 */
public class StringTokens {

    public static void main(String[] args) {
        
        String s = "XHTML; CSS; JavaScript; jQuery; java";
        s = "Venha ser feliz aprendendo java";
        String[] tokens = s.split(" ");
        System.out.println(tokens.length + " tokens");
        for (String token : tokens) {
            System.out.println(token);

        }

    }
}
