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
public class Gerente extends Funcionario {

    private String departamento;
    private double bonus;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularBonus() {
        bonus = (salario * 10) / 100;
        return bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("o nome do funcionario é: " + nome);
        System.out.println("ele é do departamento: " + departamento);
        System.out.println("o salario é: " + salario);
        System.out.println("O bonus foi de: " + bonus);
        System.out.println("o cpf é: " + cpf);
        
    }

}
