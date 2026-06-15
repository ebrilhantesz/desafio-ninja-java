package DesafioInterface;

public class Main {
    public static void main(String[] args) {

        NinjaBasico rockLee = new NinjaBasico(
                "Rock Lee",
                17,
                TipoHabilidade.TAIJUTSU
        );

        NinjaAvancado sasuke = new NinjaAvancado(
                "Sasuke",
                18,
                TipoHabilidade.RINNENGAN,
                "Sharingan"
        );

        System.out.println("=== NINJA BÁSICO ===");
        rockLee.mostrarInformacoes();
        rockLee.executarHabilidade();
        System.out.println();
        System.out.println("===== NINJA AVANÇADO =====");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
    }
}