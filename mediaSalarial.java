public class mediaSalarial {

    public static void main(String[] args) {

        //Declaração de variáveis
        String worker1 = "Junior";
        String worker2 = "Marcos";
        String worker3 = "José";
        String worker4 = "Pedro";

        double worker1wage = 1000;
        double worker2wage = 25000;
        double worker3wage = 700.2;
        double worker4wage = 12000;

        //Calculo da média
        double media = (worker1wage + worker2wage + worker3wage + worker4wage) / 4;
        
        //Limpar Terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        //Exibir resultado no terminal
        System.out.println(worker1 + " ganha " + worker1wage + " reais");
        System.out.println(worker2 + " ganha " + worker2wage + " reais");
        System.out.println(worker3 + " ganha " + worker3wage + " reais");
        System.out.println(worker4 + " ganha " + worker4wage + " reais");
        System.out.println("A media salarial dos guri é " + media + " reais \n");

    }
}