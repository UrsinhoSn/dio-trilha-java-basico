import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {

    }
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual =0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPrentedido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario" + salarioPrentedido);
            if (salarioBase >= salarioPrentedido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if (salarioBase==salarioPretendido)
            System.out.println("Ligar para o candidato com uma contra proposta");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
            }
        }
    }