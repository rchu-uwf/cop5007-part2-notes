public class Zipper implements Snaggable, DaysOfTheWeek {
    @Override
    public void unSnag() {
        System.out.println("Unzip time for zipper is " + Snaggable.TIME_TO_UNSNAG);
        System.out.println("Test DaysOfTheWeek interface " + THURSDAY);
    }
}
