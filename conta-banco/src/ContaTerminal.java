import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Double saldoConta;

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = tc.nextLine();
        System.out.println("Por favor, digite sua agencia!");
        agencia = tc.nextLine();
        System.out.println("Por favor, digite sua conta!");
        numero = tc.nextInt();
        System.out.println("Por favor, digite seu saldo!");
        saldoConta = tc.nextDouble();
        System.out.printf(
                "Olá %s obrigado por criar uma conta em nosso banco,%n sua agencia %s, conta %d e seu saldo R$%5.2f já esta disponival para saque.",
                nomeCliente, agencia, numero, saldoConta);

    }
}
