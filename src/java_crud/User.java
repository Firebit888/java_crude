package java_crud;

//Classe que representa a edentifição do utilizador
//Aqui definimos como um usuário é na nossa aplicação
public class User {

 // Atributos privados (encapsulamento)
 private int id;        // Identificador único do utilizador
 private String nome;   // Nome do utilizador
 private String email;  // Email do utilizador

 // Construtor: é chamado quando criamos um novo utilizador
 public User(int id, String nome, String email) {
     this.id = id;         // this.id refere-se ao atributo da classe
     this.nome = nome;     // atribui o nome recebido ao atributo
     this.email = email;   // atribui o email recebido ao atributo
 }

 // Getter do ID (permite acessar o id fora da classe)
 public int getId() {
     return id;
 }

 // Getter do nome
 public String getNome() {
     return nome;
 }

 // Getter do email
 public String getEmail() {
     return email;
 }

 // Setter do nome (permite alterar o nome)
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Setter do email (permite alterar o email)
 public void setEmail(String email) {
     this.email = email;
 }

 // Método que define como o objeto será exibido ao imprimir
 @Override
 public String toString() {
     return "ID: " + id +
            " | Nome: " + nome +
            " | Email: " + email;
 }
}