//Um vetor guarda 10 senhas e outro indica se cada cliente é idoso.
//A cada atendimento, chame o primeiro idoso; se não houver, a
//primeira senha. Quem está atrás do atendido anda uma posição e a
//última fica 0. Simule 3 atendimentos, mostrando a senha chamada
//e a fila.
package org.gilsom.segundo.bimestre;

public class lista1_2bimEX6 {
    public static void main(String[] args) {
        int[]senhas = new int[]{1,2,3,4,5,6,7,8,9,10};
        String[]cliente = new String[]{"Nao idoso","idoso","idoso","Nao idoso","idoso","Nao idoso","idoso","Nao idoso","idoso","Nao idoso"};
        int atendimentoIdoso = 0;

        for(int i=0;i<cliente.length;i++){
            if(cliente[i].equals("idoso")){
            atendimentoIdoso = senhas[i];
            IO.println("CHAMANDO IDOSO");
            break;
            }
        }
        if(atendimentoIdoso==0){
            IO.println("CHAMANDO ATENDIMENTO NORMAL");
        }
    }
}