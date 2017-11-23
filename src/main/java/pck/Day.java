package pck;


public class Day extends  MyEnum<Day> {
    public final static Day MONDAY = new Day("MONDAY");
    public final static Day TUESDAY = new Day("TUESDAY");
    public final static Day WEDNESDAY = new Day("WEDNESDAY");
    public final static Day THURSDAY = new Day("THURSDAY");
    public final static Day FRIDAY = new Day("FRIDAY");
    public final static Day SATURDAY = new Day("SATURDAY");
    public final static Day SUNDAY = new Day("SUNDAY");

    static {
        MONDAY.add();
        TUESDAY.add();
        WEDNESDAY.add();
        THURSDAY.add();
        FRIDAY.add();
        SATURDAY.add();
        SUNDAY.add();
    }

    public int i = 10;

    public Day(String name) {
        super(name);
    }

    public void printDay() {
        System.out.println("\n*****/" + getName() + "/******");
    }


}
