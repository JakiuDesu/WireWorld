package Cell;

public class Pixel {
    private int stan, x, y;

    public Pixel(int stan, int x, int y) {
        this.stan = stan;
        this.x = x;
        this.y = y;
    }

    public int getStan() {return stan;}
    public void setStan(int stan) {
        this.stan = stan;
    }
}
