public class Blender implements IBlender {
    private int speed = 0;
    private boolean fill = false;

    @Override
    public int GetSpeed() {
        return speed;
    }
    
    @Override
    public void Fill() {
        this.fill = true;
    }

    @Override
    public void Empty() {
        this.fill = false;
    }

    @Override
    public void SpeedUp() {
        speed += 1;
    }

    @Override
    public void SpeedDown() {
        speed += 1;
    }
}