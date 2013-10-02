/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

/**
 *
 * @author Náyron dos Anjos
 */
public class CarroBean {
    private String placa;
    private String cor;
    private String descricao;
    
   

    /**
     * responsável por devolver o valor atual do atributo
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * responsável por devolver o valor atual do atributo
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
