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
            System.out.println("2. Verificar si la licuadora esta llena");
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
                    if (blender.IsFull()){
                        System.out.println("La licuadora se encuentra llena y no se le puede agregar más ingredientes.\n");
                    } else {
                        System.out.print("Ingrese el nuevo ingrediente que desea agregar: ");
                        String ingredient = scanner.nextLine();
                        blender.addIngredient(ingredient);
                        System.out.println("Ingrediente agregado: " + ingredient);
                        System.out.println("Número de ingredientes que has añadido: " + blender.getIngredientCount());
                    }
                    break;

                case 2:
                    if (blender.IsFull()) {
                        System.out.println("La licuadora está llena.");
                    } else {
                        System.out.println("La licuadora no está llena.");
                    }
                break;

                case 3:
                if (!blender.IsFull()) { 
                    System.out.println("No se puede aumentar la velocidad si la licuadora está vacía.");
                } else {
                    blender.SpeedUp(); 
                    System.out.println("Velocidad aumentada a: " + blender.GetSpeed());
                }
                break;
            
            case 4: 
                blender.SpeedDown();
                System.out.println("Velocidad disminuida a: " + blender.GetSpeed());
                break;

                case 5:
                        System.out.println("La velocidad de tu licuadora es de: " + blender.GetSpeed()+ "\n");
                    break;

                case 6:
                    if (blender.GetSpeed() > 0){
                        System.out.println("No se puede vaciar la licuadora si esta en movimiento.\n");
                    } else {
                        blender.Empty();
                        System.out.println("La licuadora se ha vaciado con éxito.");
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