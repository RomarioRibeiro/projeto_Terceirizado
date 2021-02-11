
package utilitario;


public class Funcionario {
    
     private String nome;
    private Integer horas;
    private double valorDaHora;
    
    public Funcionario(){
        
    }
     public Funcionario(String nome,Integer horas,double valorDaHora){
         this.horas = horas;
         this.nome = nome;
         this.valorDaHora = valorDaHora;
     }

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    
    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    
    public double getValorDaHora() {
        return valorDaHora;
    }

   
    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
     
     
     public double valortotal(){
         return horas * valorDaHora;
     }
     
    
}
