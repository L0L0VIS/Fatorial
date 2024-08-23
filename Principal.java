package crud;

import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.conectar();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Listar");
            System.out.println("2. Inserir");
            System.out.println("3. Excluir");
            System.out.println("4. Atualizar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    List<Animes> animes = dao.listar();
                    for (Animes anime : animes) {
                        System.out.println(anime);
                    }
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Episodios: ");
                    String episodio = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    Jogos novoSnime = new Animes(-1, nome, episodios, genero);
                    dao.inserir(novoAnime);
                    break;
                case 3:
                    System.out.print("Digite o ID do anime para excluir: ");
                    int idExcluir = scanner.nextInt();
                    dao.excluir(idExcluir);
                    break;
                case 4:
                    System.out.print("Digite o ID do anime para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novos Episodios: ");
                    String novosEpisodios = scanner.nextLine();
                    System.out.print("Novo Gênero: ");
                    String novoGenero = scanner.nextLine();

                    Animes animeAtualizado = new Animes(idAtualizar, novoNome, novosEpisodios, novoGenero);
                    dao.atualizar(animeAtualizado);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
