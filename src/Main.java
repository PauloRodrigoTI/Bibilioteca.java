import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n=== Biblioteca ===");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Realizar empréstimo");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Listar empréstimos");
            System.out.println("5 - Relatório de livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.adicionarLivro(titulo, autor, ano);
                }
                case 2 -> {
                    System.out.print("Nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    Usuario usuario = new Usuario(nome, idade, email);
                    System.out.print("Título do livro: ");
                    String titulo = scanner.nextLine();
                    biblioteca.realizarEmprestimo(usuario, titulo);
                }
                case 3 -> {
                    System.out.print("Título do livro a devolver: ");
                    String titulo = scanner.nextLine();
                    biblioteca.devolverLivro(titulo);
                }
                case 4 -> biblioteca.listarEmprestimos();
                case 5 -> biblioteca.relatorioLivros();
                case 0 -> {
                    sair = true;
                    System.out.println("Saindo...");
                }
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
