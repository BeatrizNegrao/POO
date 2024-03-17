package pessoa;

import java.util.Scanner;

public class Pessoa {

    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p = new Pessoa();

        int opcao;
        String resultado1;
        String resultado2;
        String resultado3;
        String idade;

        System.out.println("-------------------------------------------------");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar pessoa");
            System.out.println("2. Mostrar pessoa");
            System.out.println("3. Sair");
            System.out.println("Escolha um número: ");
            opcao = ler.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida");
                continue;
            }

            
            else if (opcao == 1) {
                System.out.println("Insira o CPF: ");
                resultado1 = ler.nextLine();
                resultado1 = ler.nextLine();
                p.setCpf(resultado1);

                System.out.println("Insira o nome: ");
                resultado2 = ler.nextLine();
                p.setNome(resultado2);

                System.out.println("Insira o sexo M/F: ");
                resultado3 = ler.nextLine();
                p.setSexo(resultado3.charAt(0));

                System.out.println("Insira a idade: ");
                idade = ler.nextLine();
                p.setIdade(Integer.parseInt(idade)); 
            } else if (opcao == 2) {
                System.out.println("CPF: " + p.getCpf());
                System.out.println("Nome: " + p.getNome());
                System.out.println("Sexo: " + p.getSexo());
                System.out.println("Idade: " + p.getIdade());
            }

            else if (opcao == 3) {
                break;
            }

        } while (opcao != 3);
    }

}
