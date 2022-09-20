import java.time.LocalDate;

public class Aluno {

     private String nome;
     public String getNome() {
          return nome;
     }
     private LocalDate dataNascimento;
     public LocalDate getDataNascimento() {
          return dataNascimento;
     }
     private String email;
     public String getEmail() {
          return email;
     }
     
     public Aluno(String nome, LocalDate dataNascimento, String email){
          this.nome = nome;
          this.dataNascimento = dataNascimento;
          this.email = email;
     }
  
}