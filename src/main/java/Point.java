public class Point {
    public int x = 0;
    public int y = 0;

    // Default Constructor (Exercise 3 modification needed here)
    public Point() {
        this(0);                    //default value
    }

    // Two-argument constructor
    public Point(int x, int y) {
        // Shadowing resolution used here
        this.x = x;
        this.y = y;
    }

    public Point(int size){
        this.x = size;                  //sets x,y coords based off size
        this.y = size;

    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void printState() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

}
