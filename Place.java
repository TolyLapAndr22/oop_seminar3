package hw_oop_sem3;

public class Place {
    int x,y;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double Distance ( Place other ) {
        return Math.sqrt( Math.pow(this.x - other.x, 2 ) + Math.pow( this.x - other.y, 2 ) );
    }

    @Override
    public String toString() {
        return
                " x=" + x +
                ", y=" + y
               ;
    }
}
