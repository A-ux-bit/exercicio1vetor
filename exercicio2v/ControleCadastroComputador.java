public class ControleCadastroComputador {
    
    public ControleCadastroComputador(){
        Telacadastrocomputador telacadastrocomputador = 
        new Telacadastrocomputador();    
        computador computadors = new computador();

        telacadastrocomputador.desenhaTelacadastroComputador();
        computadors.setCpu(telacadastrocomputador.getCampoCpu());
        computadors.setRam(telacadastrocomputador.getCampoRam());;
        computadors.setSoftware(telacadastrocomputador.getCampoSoftware());

        System.out.println("");
    
    }
}
