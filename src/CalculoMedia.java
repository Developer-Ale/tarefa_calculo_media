import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Olá, vamos verificar se você passou de ano.");

        System.out.println("Digite sua primeira nota: ");
        double notaUm = s.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double notaDois = s.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double notatres = s.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        double notaQuatro = s.nextDouble();

        double mediaFinal;

        mediaFinal = ((notaUm + notaDois + notatres + notaQuatro) / 4);
        if (mediaFinal >= 7) {
            System.out.println("Parabéns! Sua média final é: " + mediaFinal + ". Você está aprovado!");
        } else if (mediaFinal >= 5) {
            System.out.println("Atenção! Sua média final é: " + mediaFinal + ". Você está em recuperação!");
        } else {
            System.out.println("Que pena! Sua média final é: " + mediaFinal + ". Você está reprovado!");
        }
    }
}
