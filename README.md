# 📚 Projeto CRUD Básico em Java

Este projeto é uma **aplicação simples em Java que implementa um CRUD**, ou seja, permite **Criar, Ler, Atualizar e Apagar utilizadores**.

O programa funciona através de um **menu interativo no terminal**, onde o utilizador escolhe as operações que pretende realizar.

---

# 🧱 Estrutura do Projeto

O projeto possui **duas classes principais**:

## 1️⃣ Classe `Main`

Responsável por:

- Executar o programa
- Mostrar o menu interativo
- Controlar as operações CRUD
- Guardar os utilizadores numa lista

## 2️⃣ Classe `User`

Representa o **modelo do utilizador**, ou seja, define **como um utilizador é representado no sistema**.

---

# 📦 Armazenamento de Dados

Os utilizadores são guardados numa estrutura dinâmica:

ArrayList<User>

Isto significa que:

📌 Os dados ficam guardados em memória

📌 A lista pode crescer dinamicamente

📌 Não é utilizada base de dados neste projeto


🔢 ID Automático

O sistema utiliza um contador automático de ID:

static int contadorId = 1;

Cada novo utilizador recebe um ID único, que é incrementado automaticamente.

Exemplo:

1 - João
2 - Maria
3 - Carlos

📋 Menu Interativo

O programa executa um loop (do while) que mantém o menu ativo até o utilizador escolher sair.

Menu apresentado no terminal:

1 - Criar utilizador
2 - Listar utilizadores
3 - Atualizar utilizador
4 - Deletar utilizador
0 - Sair

A estrutura switch é responsável por decidir qual método executar com base na opção escolhida.

⚙️ Operações CRUD
➕ CREATE (Criar utilizador)

Permite registar um novo utilizador.

Passos realizados:

Ler o nome

Ler o email

Criar um objeto User

Adicionar à lista de utilizadores

User user = new User(contadorId++, nome, email);
users.add(user);

📖 READ (Listar utilizadores)

Mostra todos os utilizadores registados.

Primeiro o sistema verifica se a lista está vazia:

users.isEmpty()

Caso existam utilizadores, percorre a lista e imprime cada um:

users.forEach(System.out::println);

✏️ UPDATE (Atualizar utilizador)

Permite alterar os dados de um utilizador existente.

Passos:

Pedir o ID do utilizador

Procurar esse ID na lista

Atualizar nome e email

u.setNome(...)
u.setEmail(...)

Se o utilizador não for encontrado, o sistema informa.

❌ DELETE (Eliminar utilizador)

Remove um utilizador com base no ID.

Utiliza o método moderno:


removeIf()

Exemplo:

users.removeIf(u -> u.getId() == id);

Este método percorre a lista e remove o utilizador com o ID indicado.

👤 Classe User

A classe User representa um utilizador do sistema.

📌 Atributos

private int id;
private String nome;
private String email;

Estes atributos são privados, aplicando o conceito de encapsulamento.

🔐 Encapsulamento

O acesso aos dados é feito através de métodos específicos.

Getters (obter valores)

getId()
getNome()
getEmail()

Setters (alterar valores)

setNome()
setEmail()

🧾 Método toString()

Este método define como o objeto será exibido ao imprimir.

Exemplo de saída no terminal:

ID: 1 | Nome: João | Email: joao@email.com

🎯 Conceitos de Programação Utilizados

Este projeto demonstra vários conceitos importantes de Java:

✅ Programação Orientada a Objetos (POO)

✅ Classes e objetos

✅ Encapsulamento

✅ ArrayList (listas dinâmicas)

✅ Scanner para entrada de dados

✅ Estruturas de controlo (switch, for, do while)

✅ Expressões lambda (removeIf)

💡 Conclusão

Este projeto representa um exemplo básico de CRUD em Java, sendo muito utilizado para aprender:

lógica de programação

manipulação de listas

criação de objetos

interação com o utilizador através do terminal

Apesar de simples, este tipo de aplicação é a base de muitos sistemas reais, que posteriormente podem evoluir para:

🗄️ integração com bases de dados

🌐 criação de APIs

🖥️ desenvolvimento de interfaces gráficas

