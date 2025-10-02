public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        int total=0;
        for (Point p : points) {        //for every point add it to the total
            total+=p.x;                 //add x coord to total
            total+=p.y;                 //add y coord to total
        }
        return total;                   //returns the sum of all coords
    }

    public static void main(String[] args) {
        Point startPoint = new Point(10,20);        //point object called startPoints starting at (10,20)
        System.out.println(startPoint.x);                 //prints x value of startPoint
        startPoint.move(5,3);               //shifts startPoint
        startPoint.printState();                            //prints coords
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);            //changes value to 99
        System.out.println(originalValue);
        Point refPoint = new Point();                       //creating reference point
        resetPoint(refPoint);                                   //sets reference point to (0,0)
        System.out.println(refPoint.x + " " +refPoint.y);                   //prints ref point
        System.out.println(sumCoordinates(startPoint,new Point(3,4)));      //sum of two points
        Point[] array = {new Point(10,2), startPoint};          //array of points
        System.out.println(sumCoordinates(array));                  //sum of the array of points
        Device d1 = new Device(1);                          //device d1
        Microwave m1 = new Microwave(1,1);      //microwave m1
        Device polyDevice = m1;                                     //device object assigned microwave (upcasting)
        polyDevice.printDescription();                      //description of the microwave b/c the microwave is assigned to the object
        ((Microwave) polyDevice).heatFood();                //downcasting in order to run
    }

    public static void resetPoint(Point p){
        p.move(0,0);            //moves point to 0,0
        p = new Point(0,0);

    }
}
