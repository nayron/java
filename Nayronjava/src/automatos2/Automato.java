
package automato;

import automato.Main.Estados;


public class Automato {
    
    private static final Estados INITIAL_STATE = Estados.Q1;
    private static final Estados STATE_OF_ACCEPTANCE = Estados.Q2;
    
    private final String cadeia;

    public Automato(String cadeia) {
        this.cadeia = cadeia;
    }

    public String getCadeia() {
        return cadeia;
    }
    
    public boolean isAceppt() {

        Estado atual = INITIAL_STATE;
        for (char symbol : cadeia.toCharArray()) {
            atual = atual.next(symbol);
        }
        return atual == STATE_OF_ACCEPTANCE;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
