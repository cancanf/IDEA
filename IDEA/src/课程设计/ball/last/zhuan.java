package 课程设计.ball.last;

public class zhuan {

    private boolean ok;
    private boolean color;
    private int x;
    private int y;

    public zhuan() {
    }

    public zhuan(boolean ok, boolean color, int x, int y) {
        this.ok = ok;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}