import java.util.Scanner;

public class mediaSalarial {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String worker1;
        String worker2;
        String worker3;
        String worker4;

        double worker1wage;
        double worker2wage;
        double worker3wage;
        double worker4wage;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Insira o nome do primeiro Funcionario: ");
        worker1 = read.nextLine();

        System.out.println("Insira o salario de " + worker1 + " ");
        worker1wage = read.nextDouble();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner read2 = new Scanner(System.in);

        System.out.println("Insira o nome do segundo Funcionario: ");
        worker2 = read2.nextLine();

        System.out.println("Insira o salario de " + worker2 + " ");
        worker2wage = read2.nextDouble();

        //
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner read3 = new Scanner(System.in);

        System.out.print("Insira o nome do terceiro Funcionario: ");
        worker3 = read3.nextLine();

        System.out.println("Insira o salario de " + worker3 + " ");
        worker3wage = read3.nextDouble();

        //
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner read4 = new Scanner(System.in);

        System.out.print("Insira o nome do quarto Funcionario: ");
        worker4 = read4.nextLine();

        System.out.println("Insira o salario de " + worker4 + " ");
        worker4wage = read4.nextDouble();

        double media = (worker1wage + worker2wage + worker3wage + worker4wage) / 4;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(worker1 + " ganha " + worker1wage + " reais");
        System.out.println(worker2 + " ganha " + worker2wage + " reais");
        System.out.println(worker3 + " ganha " + worker3wage + " reais");
        System.out.println(worker4 + " ganha " + worker4wage + " reais");
        System.out.println("A media salarial dos guri é " + media + " reais \n");

    }
}