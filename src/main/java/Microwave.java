public class Microwave extends Device{
    private int maxTime;
    public Microwave(int startPower,int maxCookingTime) {
        super(startPower);
    }
    @Override
    public void printDescription(){
        super.printDescription();          //prints the description of the device
        System.out.println("Max cooking time: " + maxTime);     //reports the time it'll take to cook in a mysterious unit of time
    }

    public void heatFood(){
        System.out.println("Food is heating");      //heating up a scrumptious meal
    }
}
