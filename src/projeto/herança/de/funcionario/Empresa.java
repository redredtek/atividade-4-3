/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.herança.de.funcionario;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Empresa {

    public void main() {
        Scanner ler = new Scanner(System.in);
        Gerente ger1 = new Gerente();
        Vendedor ver1 = new Vendedor();

        System.out.println("qual o nome do/a gerente");
        ger1.setNome(ler.nextLine());
        System.out.println("qual o salario do/a " + ger1.nome);
        ger1.setSalario(ler.nextDouble());
        System.out.println("qual o cpf do/a " + ger1.nome);
        ger1.setCpf(ler.nextInt());
        System.out.println("qual o bonus do/a " + ger1.nome);
        ger1.setBonus(ler.nextDouble());
        System.out.println("qual o departamento do/a " + ger1.nome);
        ger1.setDepartamento(ler.next());
        System.out.println("qual o nome do/a vendendor/a");
        ver1.setNome(ler.next());
        System.out.println("qual o salario do/a " + ver1.nome);
        ver1.setSalario(ler.nextDouble());
        System.out.println("qual o cpf do/a " + ver1.nome);
        ver1.setCpf(ler.nextInt());
        System.out.println("qual a comissao do/a " + ver1.nome);
        ver1.setComissao(ler.nextDouble());
        System.out.println("dados do gerente "+ger1.nome);
        ger1.exibirDados();
        System.out.println("dados do vendedor "+ver1.nome);
        ver1.exibirDados();
    }
}
