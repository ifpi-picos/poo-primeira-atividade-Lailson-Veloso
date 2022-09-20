public class Professor {

    private String nome;
    public String getNome() {
        return nome;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    private String formacao;
    public String getFormacao() {
        return formacao;
    }
    
    public Professor(String nome, String email, String formacao){
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;

   }
   
}