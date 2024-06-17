import java.util.Locale;
import java.util.Scanner;

public class ContaTermninal {
    public static void main(String[] args) {
       
        String  nome = ("Raquel");
        double saldo = (260.60);
        
        

        
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Ola, + nome " + "Obrigado por criar uma conta em nosso Banco ");
        System.out.println("Sua, + Agencia " + "numero da conta ");
        System.out.println("seu, saldo é + saldo, para saque ");
    }

}
