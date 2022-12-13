import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perimetrosFiguras geom = new perimetrosFiguras();
        areasFiguras areaFi = new areasFiguras();
        volumenesFiguras volumFi = new volumenesFiguras();
        int menu, opcion;
        try {
            do {
                geom.mostrarMenu();
                System.out.print("Seleccione una de las opciones del menu: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        do {
                            geom.menuPerimetros();
                            System.out.print("Seleccione una de las opciones del menu: ");
                            menu = sc.nextInt();

                            switch (menu) {
                                case 1:
                                    geom.perimCuadrado();

                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                case 4:

                                    break;
                                case 5:

                                    break;
                                default:
                                    System.out.println("Opcion no disponible!!!!!");
                                    break;
                            }
                            System.out.println("Desea continuar con el programa 1.SI");
                            opcion = sc.nextInt();
                        } while (opcion == 1);

                        break;
                    case 2:
                        do {
                            areaFi.menuAreas();
                            System.out.print("Seleccione una de las opciones del menu: ");
                            menu = sc.nextInt();

                            switch (menu) {
                                case 1:


                                    break;
                                case 2:


                                    break;
                                case 3:


                                    break;
                                case 4:

                                    break;
                                case 5:

                                    break;
                                default:
                                    System.out.println("Opcion no disponible!!!!!");
                                    break;
                            }
                            System.out.println("Desea continuar con el programa 1.SI");
                            opcion = sc.nextInt();
                        } while (opcion == 1);
                        break;
                    case 3:
                        do {
                            volumFi.menuVolumenes();
                            System.out.print("Seleccione una de las opciones del menu: ");
                            menu = sc.nextInt();

                            switch (menu) {
                                case 1:


                                    break;
                                case 2:


                                    break;
                                case 3:


                                    break;
                                case 4:

                                    break;
                                default:
                                    System.out.println("Opcion no disponible!!!!!");
                                    break;
                            }
                            System.out.println("Desea continuar con el programa 1.SI");
                            opcion = sc.nextInt();
                        } while (opcion == 1);

                        break;
                    default:
                        System.out.println("Opcion no disponible!!!!!");
                        break;
                }
                System.out.println("Desea continuar con el programa 1.SI");
                opcion = sc.nextInt();
            } while (opcion == 1);

        } catch (
                Exception ex) {
            System.out.println("Datos incorrectos" + ex.toString());
        }
    }
}
