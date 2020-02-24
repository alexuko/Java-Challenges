package course.javaprogramming;

public interface NodeList {
    Item getRoot();
    boolean addItem(Item item);
    boolean removeItem(Item item);
    void traverse(Item root);

}
