import java.util.*;

public class horas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira a hora");
        int hours = read.nextInt();
        System.out.println("Insira o minuto");
        int minutes = read.nextInt();
        System.out.println("Insira o segundo");
        int seconds = read.nextInt();

        int secondsCount = seconds + minutes * 60 + hours * 3600;
        int secondsLeft = 86400 - secondsCount;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Se passaram " + secondsCount + " Segundos desde o inicio do dia");
        System.out.println("Faltam " + secondsLeft + " Segundos ate o fim do dia");
    }
}
