import java.util.Stack;

/**
 * La clase Blender implementa la interfaz IBlender.
 * Esta clase maneja funcionalidades como agregar ingredientes, obtener ingredientes, y contar
 * ingredientes.
 * @Project : Hoja de trabajo 1
 * @author (Creado en conjunto con los miembros del grupo)
 * Creacion 17.01.2025
 * Ultima modificacion 23.01.2025
 * @File Name: Blender.java
 */
public class Blender implements IBlender {

    /** Número de la velocidad de la licuadora. */
    private int speed = 0;

    /** Booleano entre verdadero y falso si la licuadora tiene ingredientes o no. */
    private boolean isFull = false;

    /** Stack de ingredientes en la licuadora. */
    private Stack<String> ingredients;

    /** Número límite de ingredientes en la licuadora. */
    private final int LIMITE=5;

    /**
     * Crea un nuevo Stack de ingredientes vacio.
     */
    public Blender(){
        this.ingredients= new Stack<>();
    }

    /**
     * Obtiene la velocidad de la licuadora.
     *
     * @return Un número que representa la velocidad actual de la licuadora.
     */
    @Override
    public int GetSpeed() {
        return speed;
    }
    
    /**
     * Cambia el valor de IsFull a verdadero para representar que hay ingredientes en la licuadora.
     */
    @Override
    public void Fill() {
            isFull = true;
    }

    /**
     * Agrega un ingrediente al Stack.
     *
     * @param ingredient El nombre del ingrediente.
     */
    public void addIngredient(String ingredient) {
        if (ingredients.size() < LIMITE) {
            ingredients.push(ingredient);
        }
    }

    /**
     * Cambia el valor de IsFull a falso para representar que no hay ingredientes en la licuadora y vacía el Stack.
     */
    @Override
    public void Empty() {
        ingredients.clear();
        isFull = false;
    }

    /**
     * Aumenta la velocidad de la licuadora.
     */
    @Override
    public void SpeedUp() {
            speed += 1;
    }

    /**
     * Disminuye la velocidad de la licuadora.
     */
    @Override
    public void SpeedDown() {
        if(speed > 0){
            speed -=1;
        }
    }

    /**
     * Obtiene si la licuadora esta llena o no.
     *
     * @return Un booleano entre verdadero y falso que representa si la licuadora tiene ingredientes o no.
     */
    @Override
    public boolean IsFull(){
        return isFull;
    }

    /**
     * Obtiene los ingredientes de un Stack.
     *
     * @return Un Stack con los ingredientes en la licuadora.
     */
    public Stack<String>getIngredients(){
        Stack<String> clonedStack = new Stack<>();
        clonedStack.addAll(ingredients);
        return clonedStack;
    }

    /**
     * Obtiene el número de ingredientes en la licuadora.
     *
     * @return Un número que representa la cantidad de ingredientes.
     */
    public int getIngredientCount(){
        return ingredients.size();
    }
}