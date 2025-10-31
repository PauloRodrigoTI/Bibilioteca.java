import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int ano) {
        livros.add(new Livro(titulo, autor, ano));
        System.out.println("✅ Livro adicionado: " + titulo);
    }

    public void realizarEmprestimo(Usuario usuario, String tituloLivro) {
        Livro livro = buscarLivroDisponivel(tituloLivro);
        if (livro == null) {
            System.out.println("❌ Livro \"" + tituloLivro + "\" não disponível.");
            return;
        }
        livro.setDisponivel(false);
        emprestimos.add(new Emprestimo(usuario, livro, "10/09/2025")); // Data fixa ou usar LocalDate
        System.out.println("✅ Empréstimo realizado: " + usuario.getNome() + " pegou \"" + livro.getTitulo() + "\"");
    }

    public void devolverLivro(String tituloLivro) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro) && !l.isDisponivel()) {
                l.setDisponivel(true);
                System.out.println("✅ Livro devolvido: " + l.getTitulo());
                return;
            }
        }
        System.out.println("❌ Livro \"" + tituloLivro + "\" não encontrado ou já disponível.");
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
            return;
        }
        System.out.println("\n📚 Empréstimos:");
        for (Emprestimo e : emprestimos) {
            System.out.println("- " + e);
        }
    }

    public void relatorioLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        System.out.println("\n📖 Catálogo de Livros:");
        for (Livro l : livros) {
            System.out.println("- " + l);
        }
    }

    private Livro buscarLivroDisponivel(String tituloLivro) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(tituloLivro) && l.isDisponivel()) {
                return l;
            }
        }
        return null;
    }
}
