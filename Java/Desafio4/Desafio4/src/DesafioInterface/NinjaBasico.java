package DesafioInterface;

public class NinjaBasico extends NinjaBase {

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        super(nome, idade, habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executou a habilidade " + habilidade);
    }
}
