package first;

//importações das bibliotecas usadas
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

public class Automato{
	private ArrayList<String> alfabeto = new ArrayList<String>();
	private ArrayList<String> cadeia = new ArrayList<String>();
	private int cabeca;  //guarda a posição do vetor da cadeia a ser lida
	private ArrayList<String> estadosFinais = new ArrayList<String>();
	private String inicial;  //estado inicial
	private LinkedHashMap <String, Estado> estados = new LinkedHashMap <String, Estado>();
	private Random rand = new Random(); //variável aleatório responsável pela transição epsilon
	int chance; //chance de acontecer a transição epsilon
	
	Automato(int c){
		chance = c;
		cabeca = 0;
	}
	
	
	public void setAlfabeto(String alf){
		String[] alfabet = alf.split("\\ ");  //recebe a string e a particiona em sub-strings a cada espaço
		for(String s: alfabet)
			alfabeto.add(s);
	}
	
	public void setCadeia(String cad){
		String[] cadei = cad.split("\\ ");
		for(String s: cadei)
			cadeia.add(s);
	}
	
	public void setFinais(String fins){
		String[] finais = fins.split("\\ ");
		for(String s : finais)
			estadosFinais.add(s);
	}
	
	public boolean isFinal(String fim){
		return estadosFinais.contains(fim);
	}
	
	public void setInicial(String i){
		inicial = i;
	}
	
	public String getInicial(){
		return inicial;
	}
	
        //método que constroi o grafo
	public void addTransicao(String est){
		String[] estad = est.split("\\ ");
		String inic, fin, simbolo;
		inic = estad[0];
		fin = estad[1];
		if(estad.length == 3)
			simbolo = estad[2];
                else 
			simbolo = ""; //de acordo com a entrada pré-determinada, isso representa a transição epsilon
		//antes de adicionar as ligações, verifica-se se elas já foram adicionadas
                if(!estados.containsKey(inic))
			estados.put(inic, new Estado());	
		if(!estados.containsKey(fin))
			estados.put(fin, new Estado());
		estados.get(inic).addTransicao(simbolo, fin);
	}
	
	public int getTamanhoCadeia(){
		return cadeia.size();
	}
	
	public int getCabeca(){
		return cabeca;
	}
	
        //método que realiza a transição de estados
	public String transita(String estado) throws IOException{
		BufferedWriter escrevendo = new BufferedWriter(new FileWriter("saida.txt", true));
		String proximo;
                
                //verifica se faz a transição epsilon a partir de um número aleatório
		if(estados.get(estado).temEpsilon() && rand.nextInt(chance) == 0){
			proximo = estados.get(estado).getTransicao("").getProximo();
			escrevendo.write(estado + "---->" + proximo + "\n");
			escrevendo.newLine();
			escrevendo.close();
			return proximo;
		}
		String simbolo = cadeia.get(cabeca);
		cabeca = cabeca + 1;
                
                //verifica se o símbolo da cadeia pertence ao alfabeto determinado na entrada
		if(!alfabeto.contains(simbolo)){
			escrevendo.write("Alfabeto nao contem simbolo.");
			escrevendo.newLine();
			escrevendo.close();
			return null;
		}
                
                //verifica se existe a transição
                else if(estados.get(estado).getTransicao(simbolo) == null){
			escrevendo.write("Estado nao possui transicao correspondente ao simbolo.");
			escrevendo.newLine();
			escrevendo.close();
			return null;
		}
                
                //realiza a transição e a imprime no arquivo de saida
		proximo = estados.get(estado).getTransicao(simbolo).getProximo();
		escrevendo.write(estado + "---->" + proximo + "\n");
		escrevendo.newLine();
		escrevendo.close();
		return proximo;
	}
}