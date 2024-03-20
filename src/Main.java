import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s_Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Board.s_iHeight = 20;
        Board.s_iWidth = 15;//Time
        var seavesselsInfos = getScannerInfo();
        var names = getScannerInfo();
        for(var name : names){
            Player p = new Player(name);
            p.prepareBoard();
            for(int i = 0; i< Integer.parseInt(seavesselsInfos[0]); i++)
            {
                WarBoat wb = new WarBoat();
                p.getBoard().getVessels().add(wb);
            }
            for(int i = 0; i< Integer.parseInt(seavesselsInfos[1]); i++)
            {
                Submarine sub = new Submarine( p);
                p.getBoard().getVessels().add(sub);
            }
            System.out.println(p);
        }
    }

    public static String[] getScannerInfo(){
        var infos = Main.s_Scanner.nextLine();
        var infosArray = infos.split(",");
        return infosArray;
    }
}
