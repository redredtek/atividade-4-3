/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.herança.de.funcionario;

/**
 *
 * @author aluno.saolucas
 */
public class Vendedor extends Funcionario {

    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcSalComi() {
        salario = salario + comissao;
        return comissao;
    }
    @Override
    public void exibirDados() {
         System.out.println("o nome do funcionario é: " + nome);
        System.out.println("o cpf é: " + cpf);
        System.out.println("o salario é: " + salario);
        System.out.println("a comissão é: "+ comissao);
        System.out.println("o valor total ganho foi de: "+(salario+comissao));
    }
}
