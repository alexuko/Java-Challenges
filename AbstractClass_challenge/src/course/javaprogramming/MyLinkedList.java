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
                    currentItem.set_next(newItem).set_previous(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less, insert before
                if(currentItem.previousItem() != null){
                    currentItem.previousItem().set_next(newItem).set_previous(currentItem.previousItem());
                    newItem.set_next(currentItem).set_previous(newItem);
                }else{
                    // the node with a previous is the root
                    newItem.set_next(this.root).set_previous(newItem);
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
    public boolean removeItem(Item item) { // item "Colima"
        if(item == null){
            System.out.println("Invalid");
            return false;
        }
        Item current = this.root;
        while (current != null){//while we still having records
            int comparison = current.compareTo(item);
            if(comparison == 0){
                //comparison math the item in the list
                System.out.println(current.getValue() + " was deleted");
                if(current == this.root){//if it is the first item of the root
                    this.root = current.nextItem();

                }else {
                    // Coahuila -> Colima -> Durango
                    // Coahuila -> Durango
                    current.previous.set_next(current.nextItem());
                    if(current.nextItem() != null){
                        current.nextItem().set_previous(current.previousItem());
                    }
                }

                return true;
            }else if(comparison < 0){
                current = current.nextItem();
            }else { //comparison > 0
                //item is not in the list
                return false;
            }

        }
        //we reached the end of the list
        //we have not found the item in the list
        return false;
    }

    @Override
    public void traverse(Item root) {
        if (root == null){
            System.out.println("List is Empty");
        }else{
            while (root != null){
                System.out.println(root.getValue());
                root = root.nextItem();
            }

        }

    }
}
