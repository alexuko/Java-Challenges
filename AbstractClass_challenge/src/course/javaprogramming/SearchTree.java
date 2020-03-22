package course.javaprogramming;

public class SearchTree implements NodeList {
    private Item root = null;

    public SearchTree(Item root) {
        this.root = root;
    }

    @Override
    public Item getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(Item newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        //if its not null
        Item currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0 ){
                //new Item is greater, move right if possible
                if(currentItem.nextItem() != null ){
                    currentItem = currentItem.nextItem();
                }else{
                    //there is no node to the right, so add it
                    currentItem.set_next(newItem);
                    return true;
                }
            }else if(comparison > 0 ){
                //new Item is less, move left if possible
                if(currentItem.previousItem() != null){
                    currentItem =currentItem.previousItem();
                }else{
                    currentItem.set_previous(newItem);
                    return true;
                }
            }else{
                //equal so DONT add
                System.out.println( currentItem.getValue()+ " item is already present");
                return false;
            }
        }
        //we can't actually get here but java complains if there is no return statement
        return false;
    }

    @Override
    public boolean removeItem(Item item) {
        return false;
    }

    @Override
    public void traverse(Item root) {
        //recursive method
        if(root != null){
            traverse(root.previousItem());
            System.out.println(root.getValue());
            traverse(root.nextItem());
        }

    }
}
