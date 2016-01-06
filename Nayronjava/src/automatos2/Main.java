

package automato;


public class Main {

    

    enum Estados implements Estado{

        Q1 {
            @Override
            public Estado next(char symbol) {
                return symbol == '0' ? Q1 : Q2;
            }
        },
        Q2 {
            @Override
            public Estado next(char symbol) {
                return symbol == '0' ? Q3 : Q2;
            }
        },
        Q3 {
            @Override
            public Estado next(char symbol) {
                return Q2;
            }
        };
    };

    

    public static void main(String[] args) {
        Automato automato = new Automato("01101000");
        System.out.println(automato.isAceppt() ? "Aceito!" : "Não Aceito!");
    }
}