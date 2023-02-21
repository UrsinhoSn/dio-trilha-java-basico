public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente Valmir = new Cliente();
        Valmir.setNome("Valmir");

        Conta cc = new ContaCorrente(Valmir);
        Conta poupanca = new ContaPoupanca(Valmir);

        cc.depositar(170.0);
        cc.transferir(150.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
