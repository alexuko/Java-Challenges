package course.javaprogramming;

public interface NodeList {
    Item getRoot();
    boolean addItem(Item newItem);
    boolean removeItem(Item item);
    void traverse(Item root);

}
