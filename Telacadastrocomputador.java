import java.util.Scanner;

public class Telacadastrocomputador extends Telacadastro {

    private String cpu;
    private String ram;
    private String software;
    public String getCpu() {
        return cpu;
    }
    public String getRam() {
        return ram;
    }
    public String getSoftware() {
        return software;
    }

    public void desenhaTelacadastroComputador(){
        Scanner inputComputador = new Scanner(System.in);



        this.desenhatelacadastro();
        System.out.print("C.P.U.......");
        this.cpu = inputComputador.nextLine();
        System.out.print("R.A.M.....");
        this.ram = inputComputador.nextLine();
        System.out.print("Software.....");
        this.software = inputComputador.nextLine();

        //inputComputador.close();
    }


    
}
