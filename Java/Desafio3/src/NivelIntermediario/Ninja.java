package NivelIntermediario;

public class Ninja {
    String nomeNinja;
    int idadeNinja;
    String missaoNinja;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Ninja: " + nomeNinja + "\n" +
                "Idade: " + idadeNinja + "\n" +
                "Missao: " + missaoNinja + "\n" +
                "Dificuldade: " + nivelDificuldade + "\n" +
                "Status: " + statusMissao);
    }
}
