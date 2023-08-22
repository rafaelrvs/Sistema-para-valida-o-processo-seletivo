import java.util.concurrent.ThreadLocalRandom;

public class Selecao {
    public static void main(String[] args) throws Exception {
        
    }
    static void imprimirCandidatos(){
  
    }    
    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","MONICA", "FABRICIO","DANIELA","JOSE"};
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.legth){
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario "+ salarioPretendido);
          if(salarioBase>= salarioPretendido){
              System.out.println("O candidato "+candidato+" foi selecionado para vaga");
              candidatosSelecionados++;

          }
          candidatosAtuais++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase >salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else{
            System.out.println("Selecione outro");
        }
    }
    
}
