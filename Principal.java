
public class Principal{

     public static void main(String[] args){

        Equipamento equipamentos[] = new Equipamento[5];
        Equipamento equipamento = new Equipamento();
        Telacadastro telacadastro = new Telacadastro();

        telacadastro.desenhatelacadastro();
        equipamento.setNome(telacadastro.getNome());

        for(int i = 0; i < 5; i++){
            telacadastro.desenhatelacadastro();
            equipamento.setNome(telacadastro.getNome());
            equipamento.setModelo(telacadastro.getModelo());
            equipamento.setAtivo(telacadastro.getAtivo());
            equipamento.setDataaquisicao(telacadastro.getDataAquisicao());

            equipamentos[i] = equipamento;
        }

        for (Equipamento listaEquipamento : equipamentos){
            System.out.println(listaEquipamento + "\n");
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
    }
}
