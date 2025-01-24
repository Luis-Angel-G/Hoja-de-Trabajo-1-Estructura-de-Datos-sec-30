import java.util.Stack;

public class Blender implements IBlender {
    private int speed = 0;
    private boolean isFull = false;
    private Stack<String> ingredients;
    private final int LIMITE=5;

    public Blender(){
        this.ingredients= new Stack<>();
    }

    @Override
    public int GetSpeed() {
        return speed;
    }
    
    @Override
    public void Fill() {
            isFull = true;
    }


    public void addIngredient(String ingredient) {
        if (ingredients.size() < LIMITE) {
            ingredients.push(ingredient);
        }
    }

    @Override
    public void Empty() {
        ingredients.clear();
        isFull = false;
    }

    @Override
    public void SpeedUp() {
            speed += 1;
    }

    @Override
    public void SpeedDown() {
        if(speed > 0){
            speed -=1;
        }
    }

    @Override
    public boolean IsFull(){
        return isFull;
    }

    public Stack<String>getIngredients(){
        Stack<String> clonedStack = new Stack<>();
        clonedStack.addAll(ingredients);
        return clonedStack;
    }

    public int getIngredientCount(){
        return ingredients.size();
    }


}