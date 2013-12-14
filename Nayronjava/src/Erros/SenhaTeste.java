/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Erros;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nayron
 */
public class SenhaTeste {

    static void autenticar(String senha) throws SenhaInvalidaException {
        if ("123".equals(senha)) {

            System.out.println("Autenticado");

        } else {
            throw new SenhaInvalidaException("Senha Incorreta");

        }
    }

    public static void main(String[] args) {
        try {
            autenticar("122");
        } catch (SenhaInvalidaException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }

    }

}
