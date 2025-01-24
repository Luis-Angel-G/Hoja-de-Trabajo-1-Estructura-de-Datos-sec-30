import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Blender blender = new Blender();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido a Blender");

        while (continuar) {
            System.out.println("-------------------------- Menu: --------------------------------");
            System.out.println("1. Agregar ingredientes");
            System.out.println("2. Verificar si la licuadora tiene ingredientes");
            System.out.println("3. Aumentar velocidad");
            System.out.println("4. Disminuir velocidad");
            System.out.println("5. Verificar velocidad");
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
                    if (blender.getIngredientCount() >= 5){
                        System.out.println("La licuadora se encuentra llena y no se le puede agregar mas ingredientes.\n");
                    } else {
                        System.out.print("Ingrese el nuevo ingrediente que desea agregar: ");
                        String ingredient = scanner.nextLine();
                        blender.addIngredient(ingredient);
                        System.out.println("Ingrediente agregado: " + ingredient);
                        System.out.println("Numero de ingredientes que has añadido: " + blender.getIngredientCount() + "\n");
                        blender.Fill();
                    }
                    break;

                case 2:
                    if (blender.IsFull()) {
                        System.out.println("La licuadora tiene ingredientes.\n");
                    } else {
                        System.out.println("La licuadora no tiene ingredientes.\n");
                    }
                    break;

                case 3:
                    if (!blender.IsFull()) { 
                        System.out.println("No se puede aumentar la velocidad si la licuadora esta vacia.\n");
                    } else {
                        if (blender.GetSpeed() < 10) {
                            blender.SpeedUp(); 
                            System.out.println("Velocidad aumentada\n");
                        } else {
                            System.out.println("No se puede aumentar la velocidad porque ya esta en 10.\n");
                        }
                    }
                    break;
            
                case 4: 
                    if (!blender.IsFull()) { 
                        System.out.println("No se puede disminuir la velocidad si la licuadora esta vacia.\n");
                    } else {
                        if (blender.GetSpeed() > 0) {
                            blender.SpeedDown(); 
                            System.out.println("Velocidad disminuida\n");
                        } else {
                            System.out.println("No se puede disminuir la velocidad porque ya esta en 0.\n");
                        }
                    }
                    break;

                case 5:
                    System.out.println("La velocidad de tu licuadora es de: " + blender.GetSpeed()+ "\n");
                    break;

                case 6:
                    if (blender.IsFull()) {
                        if (blender.GetSpeed() > 0){
                            System.out.println("No se puede vaciar la licuadora si esta en movimiento.\n");
                        } else {
                            blender.Empty();
                            System.out.println("La licuadora se ha vaciado con exito.\n");
                        }
                    } else {
                        System.out.println("La licuadora ya se encuentra vacia.\n");
                    }
                    break;

                case 7:
                    System.out.println("Cerrando programa\n");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.\n");
                    break;
            }
        }
        scanner.close();
    }
}