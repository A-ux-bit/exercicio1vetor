import java.util.Scanner;

public class ControleMenuPrincipal {
    public ControleMenuPrincipal (){
         Scanner input = new Scanner(System.in);
        do {
            new TelaMenuPrincipal();
             switch (Integer.parseInt(input.nextLine())) {
            case 1:
            new ControleCadastroComputador();
            break;
            case 2:
                 System.out.println("Em construção.....");
            case 3:
            System.exit(0);
            break;
        
            default:
                break;
        }
        System.out.println("Deseja continuar? [S/N]:");
        } while(input.nextLine().equals("S")||input.nextLine().equals("s"));
    }
    
}
