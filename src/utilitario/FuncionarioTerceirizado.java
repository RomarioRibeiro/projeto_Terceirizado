
package utilitario;


public class FuncionarioTerceirizado extends Funcionario {
    
    private double addFuncionario;
    
    public FuncionarioTerceirizado(){
        super();
    }
    public FuncionarioTerceirizado(String nome,Integer horas,double valorDaHora,double addFuncionario){
        super(nome,horas,valorDaHora);
        this.addFuncionario= addFuncionario;
    }


    public double getAddFuncionario() {
        return addFuncionario;
    }

    public void setAddFuncionario(double addFuncionario) {
        this.addFuncionario = addFuncionario;
    }
    
    @Override
     public double valortotal(){
         return super.valortotal() + addFuncionario * 1.1;
     }
}
