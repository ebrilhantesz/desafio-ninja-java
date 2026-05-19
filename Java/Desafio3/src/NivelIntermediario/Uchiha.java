package NivelIntermediario;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial do ninja: " + habilidadeEspecial + "!");
    }

    public void mostrarInformacoes(){
        System.out.println("Ninja: " + nomeNinja + "\n" +
                "Idade: " + idadeNinja + "\n" +
                "Missao: " + missaoNinja + "\n" +
                "Dificuldade: " + nivelDificuldade + "\n" +
                "Status: " + statusMissao + "\n" +
                "Habilidade especial: " + habilidadeEspecial);
    }

}
