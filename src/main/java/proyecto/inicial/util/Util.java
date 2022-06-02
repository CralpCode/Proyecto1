package proyecto.inicial.util;

import java.util.Scanner;
import proyecto.inicial.Laberinto.Laberinto;
import proyecto.inicial.Menus.MenusPrin;


public class Util {

    private static Scanner entrada = new Scanner(System.in);

    public static String mensaje(int num, int num2) {
        String[] mensajes = new String[10];
        mensajes[0] = "╔═══════Menu***********";
        mensajes[1] = "*******Submenu*********";
        mensajes[2] = "*"+num2+")     Jugar         *";
        mensajes[3] = "*"+num2+")   Crear Mapa      *";
        mensajes[4] = "*"+num2+") Visualizar mapa   *";
        mensajes[5] = "*"+num2+")  Volver al menu   *";
        mensajes[6] = "*"+num2+")     Salir         *";
        mensajes[7] = "***********************";
        
        return mensajes[num];
    }

    public static int regresoCatch() {
        int num = 0;

        try {
            num = Integer.parseInt(entrada.nextLine());
        } catch (Exception e) {
            
        }
        
        return num;
    }

    public static void submenus(int num, String tipo) { 
        
        if (tipo.equals("Menu")) {
            switch (num) {
                case 1:
                    new Laberinto().generadorLaberinto();
                break;               
                case 2:
                    
                break;          
                case 3:
                    
                break;
                case 4:
                    
                break;
                default:       
                System.out.println("Por favor ingrese un valor correcto");
                break;               
            }
        }

        if (tipo.equals("Volver")) {
            switch (num) {
                case 1:
                    new MenusPrin().inicial();
                break;               
                case 2:
                 
                break;
                default:       
                System.out.println("Por favor ingrese un valor correcto");
                break;               
            }
        }
        
        if (tipo.equals("Visualizar")) {
            switch (num) {
                case 1:
                    
                break;               
                case 2:
                    new MenusPrin().inicial();
                break;          
                case 3:

                break;
                default:       
                System.out.println("Por favor ingrese un valor correcto");
                break;               
            }
        }
    }
}
