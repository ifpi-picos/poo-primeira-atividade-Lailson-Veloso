import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws Exception {
        Professor professor1 = new Professor("Steve Jobs", "stevejobs@gmail.com", "ADS");
      
        Curso curso1 = new Curso("ADS", 2000, "Presencial", LocalDate.now(), LocalDate.now());

        Aluno aluno1 = new Aluno("Lailson Veloso", LocalDate.now(), "lailsonveloso@gmail.com");
      
        Certificado certificado1 = new Certificado("Lailson Veloso", "ADS", 2000);

        System.out.println("Nome do Professor: " + professor1.getNome());
        System.out.println("Nome do Curso: " + curso1.getNome());
        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Certificado - Nome do Aluno: " + certificado1.getNomeAluno() + " - Nome do Curso: " + certificado1.getNomeCurso());
      
    }                               
}