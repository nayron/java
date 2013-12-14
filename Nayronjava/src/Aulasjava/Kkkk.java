package Aulasjava;
import java.util.*;
public class Kkkk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 int dias, grupo, op1;
		    double valor, milhas;
		   System.out.println("Quantas pessoas tem no grupo?");
		   grupo = ler.nextInt();
		   System.out.println("Quantos dias o grupo deseja passar hospedado?");
		    dias = ler.nextInt();
		    System.out.println("O grupo deseja translado aeroporto-hotel [1]Sim [2]Nao");
		    op1 = ler.nextInt();
		    System.out.println("\nQual a quantidade de milhas entre origem e destino?");
		    milhas=ler.nextDouble();
		    valor=(dias*grupo*100)+(50*milhas*grupo);
		    if (op1 == 1) {
		    	valor=valor+60;}
		    else {}
		    if (grupo>3 && grupo <10) {
		    	valor=valor-(valor*0.05);}
		    else {
		        if (grupo>=10) {
		        	valor=valor-(valor*0.1);}
		        else {}
		    }
		    System.out.println();
		    System.out.println("O valor final do pacote eh:R$" + valor);
	}

}
