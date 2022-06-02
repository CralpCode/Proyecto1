package proyecto.inicial.Laberinto;

import proyecto.inicial.Menus.MenusPrin;

public class Laberinto {
    
    private String[][][] laberintos = new String[30][30][3];    

    public void generadorLaberinto(){

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                laberintos[i][j][0] = j==0 || j==29 || i==0 || i==29 ? "#":"0" ;
                System.out.print(laberintos[i][j][0] + " ");
            }
            System.out.println("");
        }

        new MenusPrin().volver();
        
    }

}
