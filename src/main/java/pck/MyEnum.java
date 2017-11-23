package pck;

import java.util.ArrayList;

public abstract class MyEnum<E extends MyEnum<E>> {

    private String name;

    private int ordinal;

    private final static ArrayList<MyEnum> date = new ArrayList<>();


    protected MyEnum(String name) {
        this.name = name;
    }


    protected MyEnum<E> add() {
        date.add(this);
        this.ordinal = date.size() - 1;
        return this;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getOrdinal() {
        return ordinal;
    }

    protected void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }


    public static <T extends MyEnum> ArrayList<? super T> values(Class clazz) {
        return null;
    }

    public E valueOf(String name) {
        for(Object o : date) {
            if (((MyEnum) o).getName().equals(name)) {
                return (E) o;
            }
        }
        throw new IllegalArgumentException("No enam constant with name " + name);
    }

    public ArrayList<E> values() {
        ArrayList<E> out = new ArrayList<>();
        for (Object ob : date) {
            out.add((E) ob);
        }
        return out;
    }

    @Override
    public String toString() {
        return name;
    }
}
