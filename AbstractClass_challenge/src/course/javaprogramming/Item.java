package course.javaprogramming;

public abstract class Item {
    protected Item next = null;
    protected Item previous = null;

    protected Object value;

    public Item(Object value) {
        this.value = value;
    }

    abstract Item nextItem();
    abstract Item set_next(Item item);
    abstract Item previousItem();
    abstract Item set_previous(Item item);
    abstract int compareTo(Item item);


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
