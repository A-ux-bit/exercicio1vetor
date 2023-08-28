import java.util.ArrayList;
import java.util.Scanner;

public class Principal{

     public static void main(String[] args){
        Telacadastro telacadastro = new Telacadastro();

        //Declaração array unidimensional
        //Equipamento equipamentos[] = new Equipamento[5];
        //declaração array matriz
        //Equipamento equipamentos[][] = new Equipamento[2][2];
        //declaração array list
        ArrayList<Equipamento> arrayListEquipamento = new ArrayList<>();
        Scanner continua = new Scanner(System.in);
        String result = "s";
        telacadastro.desenhatelacadastro();
       /*  for(int i = 0; i < 5; i++){
            for(int j = 0; j < 2; j++){*/
           while ((result.equals("s")) || (result.equals("S"))) {
            
           } {    
            Equipamento equipamento = new Equipamento();
            arrayListEquipamento = new ArrayList<>();
            telacadastro.desenhatelacadastro();
            equipamento.setId(telacadastro.getId());
            equipamento.setNome(telacadastro.getNome());
            equipamento.setModelo(telacadastro.getModelo());
            equipamento.setAtivo(telacadastro.getAtivo());
            equipamento.setDataaquisicao(telacadastro.getDataAquisicao());
            arrayListEquipamento.add(equipamento);
            System.out.print("\n Continua [S/N]:");
            result = continua.nextLine();
        }

        for (Equipamento equipamento : arrayListEquipamento){
            System.out.println("\n"+equipamento + "\n");
        }
    }


           /* for (int i=0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                     System.out.println(equipamentos[0][0] + "\n");

                }
            } */

       /* for (Equipamento listaEquipamento : equipamentos){
        }
        equipamento.setNome("Painel de controle");
        equipamento.setModelo("Modelo Lunar");
        equipamento.setAtivo(true);
        equipamentos[0] = equipamento;


        equipamento = new Equipamento();
        equipamento.setNome("Impressora em Lona");
        equipamento.setModelo("Modelo Solar");
        equipamento.setAtivo(false);
        equipamentos[1] = equipamento;

        for (Equipamento equi : equipamentos) {
            System.out.println(equi + "\n");
        }
    }*/
    }
