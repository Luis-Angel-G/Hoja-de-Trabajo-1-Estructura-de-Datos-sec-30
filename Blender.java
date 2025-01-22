public class Blender {
    int speed;
    boolean fill;

    int GetSpeed() {
        return speed;
    }

    void Fill(boolean fill) {
        this.fill = true;
    }

    void Empty(boolean fill) {
        this.fill = false;
    }
}