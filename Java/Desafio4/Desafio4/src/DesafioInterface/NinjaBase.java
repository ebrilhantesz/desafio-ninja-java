package DesafioInterface;

// Clase abstrata base para molde das classes filhas
public abstract class NinjaBase implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBase(String nome,
                     int idade,
                     TipoHabilidade habilidade) {

        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }
}
