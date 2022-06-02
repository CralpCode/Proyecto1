package proyecto.inicial.Menus;

import proyecto.inicial.util.Util;

public class MenusPrin {

    private int salir = 0;

    public void inicial() {
        int conteo = -1;
        salir = 0;
        do {
            conteo = -1;
            for (int i = 0; i < 8; i++) {
                if (i != 1 && i != 5) {
                    conteo = conteo + 1;
                    System.out.println(Util.mensaje(i, conteo));
                }
            }

            salir = Util.regresoCatch();
            Util.submenus(salir,"Menu");   

        } while (salir<1 || salir>4);

    }

    public void volver() {
        int conteo = -1;
        salir = 0;

        do {
            conteo = -1;
            for (int i = 0; i < 8; i++) {
                if (i != 0 && i!= 2 && i!=3 && i!= 4 ) {
                    conteo = conteo + 1;
                    System.out.println(Util.mensaje(i, conteo));
                }
            }

            salir = Util.regresoCatch();
            Util.submenus(salir,"Volver");
        
        } while (salir<1 || salir>2);

    }
}
