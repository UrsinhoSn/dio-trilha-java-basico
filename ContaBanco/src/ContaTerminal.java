import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o numero da sua conta ?");
        Integer Conta = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Qual o numero da sua agencia ?");
        String Agencia = entrada.nextLine();

        System.out.println("Qual o seu nome ?");
        String Cliente = entrada.nextLine();

        System.out.println("Qual o seu saldo  ?");
        Double Saldo = entrada.nextDouble();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.1f já está disponível para saque" , Cliente,Agencia,Conta,Saldo );
    }
}