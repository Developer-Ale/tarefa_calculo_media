public class CalculoMedia {

    public static void main(String[] args){

        Notas notas = new Notas();
        notas.getNota1();
        System.out.println("Sua primeira nota é: " + notas.getNota1());
        notas.getNota2();
        System.out.println("Sua segunda nota é: " + notas.getNota2());
        notas.getNota3();
        System.out.println("Sua terceira nota é: " + notas.getNota3());
        notas.getNota4();
        System.out.println("Sua quarta nota é: " + notas.getNota4());

        double mediaFinal;

        mediaFinal = ((notas.getNota1() + notas.getNota2() + notas.getNota3() + notas.getNota4()) / 4);
        if (mediaFinal >= 6){
            System.out.println("Parabéns! Sua média final é: " + mediaFinal + ". Você está aprovado!");
        } else {
            System.out.println("Atenção! Sua média final é: " + mediaFinal + ". Você está em recuperação!");
        }

    }

}
