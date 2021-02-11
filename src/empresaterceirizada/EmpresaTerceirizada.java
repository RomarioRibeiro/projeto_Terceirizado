
package empresaterceirizada;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import utilitario.Funcionario;
import utilitario.FuncionarioTerceirizado;


public class EmpresaTerceirizada {

    
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner (System.in);
        List<Funcionario> list =new ArrayList<>();
        
        
        System.out.print("INFORME QUANTOS FUNCIONARIO ?");
        int funcionarioN =ler.nextInt();
        for(int i=1; i<=funcionarioN;i++){
            System.out.println("FUNCIONARIO #" + i + ":");
            System.out.println("FUNCIONARIO É TERCEIRIZADO s/n ?");
            char ch = ler.next().charAt(0);
            ler.nextLine();
            System.out.println("INFORME O NOME :");
            String nome =ler.nextLine();
            System.out.println("INFORME A QUANTIDADE DE HORAS ?");
            Integer horas = ler.nextInt();
            System.out.println("INFORME OVALOR DAS HORAS ?");
            double valorDaHora= ler.nextDouble();
            
            if(ch == 's'){
                System.out.println("VALOR DO TERCEIRIZADO  :");
                double addFucionario =ler.nextDouble();
                Funcionario emp =new FuncionarioTerceirizado(nome, horas, valorDaHora, addFucionario);
                list.add(emp);
            }else{
                Funcionario emp =new Funcionario(nome, horas, valorDaHora);
                list.add(emp);
            }
                
        }
        System.out.println();
        System.out.println("FUNSIONARIOS :");
        for(Funcionario emp : list){
            System.out.println(emp.getNome() + " - $" + String.format("%.2f",  emp.valortotal()));
        }
        
        
        
        
      ler.close();
    }
    
}
