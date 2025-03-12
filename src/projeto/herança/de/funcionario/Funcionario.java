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
public class Funcionario {

    protected int cpf;
    protected String nome;
    protected double salario;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("o nome do funcionario é: " + nome);
        System.out.println("o cpf é: " + cpf);
        System.out.println("o salario é: " + salario);
    }
}
