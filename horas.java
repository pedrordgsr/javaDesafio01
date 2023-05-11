public class horas {
    public static void main(String[] args) {

        //declaração de variáveis
        int hours = 10;
  
        int minutes = 45;

        int seconds = 30;

        //equação para calcular segundos que faltam e que já passaram
        int secondsCount = seconds + minutes * 60 + hours * 3600;
        int secondsLeft = 86400 - secondsCount;

        //limpar terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //imprimir resultado
        System.out.println("Se passaram " + secondsCount + " Segundos desde o inicio do dia");
        System.out.println("Faltam " + secondsLeft + " Segundos ate o fim do dia");
    }
}
