package NivelIntermediario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Abrir o scanner para o usuario
        Scanner sc = new Scanner(System.in);
        // Abrir o array dos ninjas
        Uchiha[] ninjas = new Uchiha[10];

        Uchiha sasuke = new Uchiha();
        sasuke.nomeNinja = "Sasuke Uchiha";
        sasuke.idadeNinja = 18;
        sasuke.missaoNinja = "Reconhecimento vila inimiga";
        sasuke.nivelDificuldade = "Alfa";
        sasuke.statusMissao = "Em andamento";
        sasuke.habilidadeEspecial = "Susanoo";
        ninjas[0] = sasuke;

        int quantidadeNinjas = 1;
        int opcaoUsuario = 0;
        while (opcaoUsuario != 6) {

            // Mostrar menu ao usuário
            System.out.println("\n===== MENU NINJA =====" + "\n" +
                    "1 - Mostrar informações dos ninjas" + "\n" +
                    "2 - Adicionar ninja" + "\n" +
                    "3 - Editar ninja" + "\n" +
                    "4 - Deletar ninja" + "\n" +
                    "5 - Mostrar habilidade especial" + "\n" +
                    "6 - Sair");
            System.out.println("Digite uma opção: ");
            opcaoUsuario = sc.nextInt();
            sc.nextLine();
            System.out.println("Você escolheu a opção: " + opcaoUsuario + "!");

            switch (opcaoUsuario) {
                // Mostrar as informações dos ninjas
                case 1:
                    System.out.println("\n== INFORMAÇÕES NINJAS ==");
                    for (int i = 0; i < quantidadeNinjas; i++) {
                        System.out.println("\nNINJA " + (i +1));
                        ninjas[i].mostrarInformacoes();
                    }
                    break;
                // Adicionando um ninja a array
                case 2:
                    if (quantidadeNinjas < ninjas.length) {
                        Uchiha novoNinja = new Uchiha();

                        System.out.println("\n== ADICIONAR NINJAS ==");
                        System.out.println("Digite o nome do ninja: ");
                        novoNinja.nomeNinja = sc.nextLine();
                        System.out.println("Digite o idade do ninja: ");
                        novoNinja.idadeNinja = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite a missão relacionada ao ninja: ");
                        novoNinja.missaoNinja = sc.nextLine();
                        System.out.println("Digite o nivel de dificuldade da missão: ");
                        novoNinja.nivelDificuldade = sc.nextLine();
                        System.out.println("Digite o status da missão: ");
                        novoNinja.statusMissao = sc.nextLine();
                        System.out.println("Digite a habilidade especial do ninja: ");
                        novoNinja.habilidadeEspecial = sc.nextLine();

                        ninjas[quantidadeNinjas] = novoNinja;
                        quantidadeNinjas++;
                        System.out.println("Ninja adicionado com sucesso!");
                    } else {
                        System.out.println("Quantidade máxima de ninjas atingido!");
                    }
                    break;
                // Editando um ninja
                case 3:
                    if (quantidadeNinjas > 0){
                        System.out.println("\n== EDITAR NINJAS ==");
                        for (int i = 0; i < quantidadeNinjas; i++) {
                            System.out.println((i +1) + " - " + ninjas[i].nomeNinja);
                        }
                        System.out.println("Escolha um ninja para editar: ");
                        int indiceEdicao = sc.nextInt();
                        sc.nextLine();
                        indiceEdicao--;

                        if (indiceEdicao >= 0 && indiceEdicao < quantidadeNinjas) {
                            System.out.println("Digite o novo nome do ninja: ");
                            ninjas[indiceEdicao].nomeNinja = sc.nextLine();
                            System.out.println("Digite a nova idade do ninja: ");
                            ninjas[indiceEdicao].idadeNinja = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Digite a nova missão do ninja: ");
                            ninjas[indiceEdicao].missaoNinja = sc.nextLine();
                            System.out.println("Digite a dificuldade da nova missão: ");
                            ninjas[indiceEdicao].nivelDificuldade = sc.nextLine();
                            System.out.println("Digite o status da missão: ");
                            ninjas[indiceEdicao].statusMissao = sc.nextLine();
                            System.out.println("Digite a habilidade especial do ninja: ");
                            ninjas[indiceEdicao].habilidadeEspecial = sc.nextLine();

                            System.out.println("Ninja atualizado com sucesso!");
                        } else {
                            System.out.println("Ninja inválido!");
                        }
                    } else {
                        System.out.println("Nenhum ninja cadastrado para edição!");
                    }
                    break;
                // Deletando um ninja
                case 4:
                    if(quantidadeNinjas > 0){
                        System.out.println("\n== DELETAR NINJAS ==");
                        for (int i = 0; i < quantidadeNinjas; i++) {
                            System.out.println(
                                    (i + 1) + " - " + ninjas[i].nomeNinja);
                        }
                        System.out.println("\nEscolha um ninja para deletar: ");
                        int indiceDeletar = sc.nextInt();
                        sc.nextLine();
                        indiceDeletar--;

                        if(indiceDeletar >= 0 && indiceDeletar < quantidadeNinjas){
                            for (int i = indiceDeletar; i < quantidadeNinjas -1; i++) {
                                ninjas[i] = ninjas[i + 1];
                            }
                            ninjas[quantidadeNinjas -1] = null;
                            quantidadeNinjas--;
                            System.out.println("Ninja deletado com sucesso!");
                        } else {
                            System.out.println("Ninja inválido");
                        }
                    } else {
                        System.out.println("Nenhum ninja cadastrado!");
                    }
                    break;
                // Visualizando as habilidade especiais
                case 5:
                    System.out.println("\n== HABILIDADES ESPECIAIS ==");
                    for (int i = 0; i < quantidadeNinjas; i++) {
                        System.out.println(
                                ninjas[i].nomeNinja + " -> " + ninjas[i].habilidadeEspecial);
                    }
                    break;
                // Encerrando o sistema
                case 6:
                    System.out.println("Encerrando o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
