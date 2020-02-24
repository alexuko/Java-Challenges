package course.javaprogramming;

public class MyLinkedList implements NodeList {
    private Item root = null;

    public MyLinkedList(Item root) {
        this.root = root;
    }

    @Override
    public Item getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Item newItem) {
        if(this.root == null){
            //if the list is empty this item will be at the head of the list
            this.root = newItem;
            return true;
        }

        Item currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //if new item is greater
                if(currentItem.nextItem() != null){
                    //move pointer to the next item
                    currentItem = currentItem.nextItem();
                }else {
                    //if there is no next, then insert at the end of the list
                    currentItem.set_next(newItem);
                    newItem.set_previous(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less, insert before
                if(currentItem.previousItem() != null){
                    currentItem.previousItem().set_next(newItem);
                    newItem.set_previous(currentItem.previousItem());
                    newItem.set_next(currentItem);
                    currentItem.set_previous(newItem);
                }else{
                    // the node with a previous is the root
                    this.root.set_previous(newItem);
                    this.root = newItem;
                }
                return true;

            }else {
                //equal, is already in the list
                System.out.println(newItem.getValue() + " is already present, NOT added. ");
                return false;

            }
            //end of while loop
        }
        return false;


    }

    @Override
    public boolean removeItem(Item item) {
        return false;
    }

    @Override
    public void traverse(Item root) {

    }
}
