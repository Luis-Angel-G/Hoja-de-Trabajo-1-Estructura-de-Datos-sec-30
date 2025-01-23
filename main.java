import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Blender blender = new Blender();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido a Blender");

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Llenar");
            System.out.println("2. Aumentar velocidad");
            System.out.println("3. Disminuir velocidad");
            System.out.println("4. Verificar velocidad");
            System.out.println("5. Verificar si esta lleno");
            System.out.println("6. Vaciar");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");

            int opcion = 0;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    if (blender.GetSpeed() > 0){
                        System.out.println("No se puede llenar la Blender si esta en movimiento.\n");
                    } else {
                        if (!blender.IsFull()) {
                            blender.Fill();
                            System.out.println("La Blender se ha llenado con exito.\n");
                        } else {
                            System.out.println("La Blender ya esta llena.\n");
                        }
                    }
                    break;

                case 2:
                    if (blender.IsFull()){
                        blender.SpeedUp();
                        System.out.println("Se ha aumentado la velocidad.\n");
                    } else {
                        System.out.println("No se puede aumentar la velocidad si la Blender esta vacia.\n");
                    }
                    break;

                case 3:
                    if (blender.IsFull()){
                        if (blender.GetSpeed() > 0) {
                            blender.SpeedDown();
                            System.out.println("Se ha disminuido la velocidad.\n");
                        } else {
                            System.out.println("La velocidad ya esta en 0.\n");
                        }
                    } else {
                        System.out.println("No se puede disminuir la velocidad si la Blender esta vacia.\n");
                    }
                    break;

                case 4:
                    System.out.println("La velocidad actual es: " + blender.GetSpeed() + "\n");
                    break;

                case 5:
                    if (blender.IsFull()) {
                        System.out.println("La Blender esta llena.\n");
                    } else {
                        System.out.println("La Blender esta vacia.\n");
                    }
                    break;

                case 6:
                    if (blender.GetSpeed() > 0){
                        System.out.println("No se puede vaciar la Blender si esta en movimiento.\n");
                    } else {
                        if (blender.IsFull()) {
                            blender.Empty();
                            System.out.println("La Blender se ha vaciado con exito.\n");
                        } else {
                            System.out.println("La Blender ya esta vacia.\n");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Cerrando programa\n");
                    continuar = false;

                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.\n");
                    break;
            }
        }
        scanner.close();
    }
}