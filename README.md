1️⃣ Estrutura de classes

Livro

Encapsulamento dos atributos (private) ✅
Construtor que inicializa título, autor, ano e já define disponivel = true ✅
Getters e Setters para acessar os atributos ✅
Método toString() amigável, mostrando status “Disponível” ou “Emprestado” ✅

Usuario

Encapsulamento dos atributos (nome, idade, email) ✅
Construtor para criar usuário de forma prática ✅
Getters e Setters ✅
toString() para exibir informações do usuário de forma legível ✅

Emprestimo
Encapsulamento (usuario, livro, data) ✅
Construtor que recebe usuário, livro e data ✅
Getters ✅
toString() para exibir o empréstimo de forma clara ✅

Biblioteca

Uso de listas privadas (livros e emprestimos) ✅
Métodos refatorados:
adicionarLivro() ✅
realizarEmprestimo() ✅
devolverLivro() ✅ (novo, antes não existia)
listarEmprestimos() ✅
relatorioLivros() ✅
Método auxiliar buscarLivroDisponivel() para simplificar lógica de empréstimo ✅

2️⃣ Refatoramento do fluxo no Main

Antes:

Todos os dados eram hardcoded (livros, usuários, empréstimos). ❌
Nada era interativo, o código rodava automaticamente. ❌

Agora:

Sistema interativo usando Scanner ✅
Menu com opções:
Adicionar livro
Realizar empréstimo
Devolver livro
Listar empréstimos
Relatório de livros

Sair

Leitura de entradas do usuário para criar livros e usuários dinamicamente ✅
Limpeza do buffer do Scanner para evitar erros ✅
Fluxo de empréstimos e devoluções atualizado conforme escolha do usuário ✅

3️⃣ Melhorias de legibilidade e mensagens

Mensagens claras com emojis e status, tipo:

✅ Livro adicionado
❌ Livro não disponível
📚 Empréstimos:
📖 Catálogo de Livros:

toString() padronizado para exibição amigável de objetos ✅

4️⃣ Boas práticas aplicadas

Encapsulamento total (nenhum atributo público sem necessidade) ✅
Construtores claros para inicializar objetos ✅
Separação de responsabilidades: Biblioteca só cuida da lógica de livros/emprestimos, Main só cuida da interação ✅
Código limpo e legível (nomes descritivos, fluxo fácil de entender) ✅
