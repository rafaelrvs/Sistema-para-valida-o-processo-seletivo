public class Contador {
       public static void main(String[] args) throws Exception {
      for(int contador = 1 ; contador <= 20; contador ++){
        System.out.println("Contando: " + contador);
        if(contador == 12){
            System.out.println("Você chegou no primeiro checkpoint de numero 12");
        }
        else if( contador == 30){
            System.out.println("Você chegou no segundo checkpoint de numero 12");
        }
        
    }
    System.out.println("Parando contagem");
    }
}
