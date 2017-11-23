package pck;

public class Main {

    public static void main(String[] args)  {
        Day container = new Day("container");

        for (Day day : container.values()) {
            System.out.println(day.getName() + " = " + day.getOrdinal());
        }

        //invoke method from Day
        Day.SUNDAY.printDay();

    }
}
