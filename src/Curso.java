import java.time.LocalDate;

public class Curso {

     private String nome;
     public String getNome() {
          return nome;
     }
     private int cargaHoraria;
     public int getCargaHoraria() {
          return cargaHoraria;
     }
     private String modalidade;
     public String getModalidade() {
          return modalidade;
     }
     private LocalDate dataInicio;
     public LocalDate getDataInicio() {
          return dataInicio;
     }
     private LocalDate dataFim;
     public LocalDate getDataFim() {
          return dataFim;
     }

     public Curso(String nome, int cargaHoraria, String modalidade, LocalDate dataInicio, LocalDate dataFim){
          this.nome = nome;
          this.cargaHoraria = cargaHoraria;
          this.modalidade = modalidade;
          this.dataInicio = dataInicio;
          this.dataFim = dataFim;
     }
     
}