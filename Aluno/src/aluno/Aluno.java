package aluno;

import java.util.Scanner;

public class Aluno {

    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

    public float calcularMedia() {
        return ((ac1 * 0.15f) + (ac2 * 0.30f) + (ag * 0.10f) + (af * 0.45f));
    }

    public static String imprimir(Aluno a) {
        return "RA: " + a.getRa() + "\n"
                + "Nome: " + a.getNome() + "\n"
                + "Nota AC1: " + a.getAc1() + "\n"
                + "Nota AC2: " + a.getAc2() + "\n"
                + "Nota AG: " + a.getAg() + "\n"
                + "Nota AF: " + a.getAf() + "\n"
                + "Média: " + a.calcularMedia() +"\n"
                + "Situação: " + a.verificarAprovacao();
    }
    
    public String verificarAprovacao() {
        if(calcularMedia() >=5){ 
            return "Aluno aprovado";
        } else {
            return "Aluno reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a = new Aluno();

        int opcao;
        String resultado1;
        String resultado2;
        float resultado3;
        float resultado4;
        float resultado5;
        float resultado6;

        float notaAc1 = 0;
        float notaAc2 = 0;
        float notaAg = 0;
        float notaAf = 0;
        float media = 0;

        System.out.println("----------------------------------------------------");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar aluno");
            System.out.println("2. Mostrar aluno");
            System.out.println("3. Sair");
            System.out.println("Escolha um opçao: ");
            opcao = ler.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida! ");
                continue;
            } else if (opcao == 1) {
                System.out.println("Insira o RA: ");
                resultado1 = ler.nextLine();
                resultado1 = ler.nextLine();
                a.setRa(resultado1);

                System.out.println("Insira o nome: ");
                resultado2 = ler.nextLine();
                a.setNome(resultado2);

                System.out.println("Insira a nota AC1: ");
                resultado3 = ler.nextFloat();
                a.setAc1(resultado3);
                notaAc1 = resultado3;

                System.out.println("Insira a nota AC2: ");
                resultado4 = ler.nextFloat();
                a.setAc2(resultado4);
                notaAc2 = resultado4;

                System.out.println("Insira a nota AG: ");
                resultado5 = ler.nextFloat();
                a.setAg(resultado5);
                notaAg = resultado5;

                System.out.println("Isira a nota AF: ");
                resultado6 = ler.nextFloat();
                a.setAf(resultado6);
                notaAf = resultado6;

            } else if (opcao == 2) {
                System.out.println(imprimir(a));

            } else if (opcao == 3) {
                break;
            }

        } while (opcao != 3);

    }

}
