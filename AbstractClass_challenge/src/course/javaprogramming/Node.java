package course.javaprogramming;

public class Node extends Item {

    public Node(Object value) {
        super(value);
    }

    @Override
    Item nextItem() {
        return this.next;
    }

    @Override
    Item set_next(Item item) {
        this.next = item;
        return this.next;
    }

    @Override
    Item previousItem() {
        return this.previous;
    }

    @Override
    Item set_previous(Item item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    int compareTo(Item item) {
        if(item != null)
            return ((String) super.getValue()).compareTo((String) item.getValue());

        return -1;
    }
}
