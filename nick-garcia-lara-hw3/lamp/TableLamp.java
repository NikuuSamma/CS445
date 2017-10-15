package lamp;
import buttons.Button;
import buttons.PushDownButton;

public class TableLamp 
{       
    public static void main(String[] args)
    {
        System.out.println("\nParts 1 and 2");
        System.out.println("----------------------------");
        Button b = new Button();
        b.switchOn();
        b.switchOff();
     
        System.out.println("\nPart 3");
        System.out.println("----------------------------");
        PushDownButton pb = new PushDownButton();
        pb.pushButton();
        pb.pushButton();
        System.out.println("\nDid not have to rebuild LightBulb when Button was replaced.\n");  
    }
}
