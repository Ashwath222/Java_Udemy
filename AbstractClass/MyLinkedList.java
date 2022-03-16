package AbstractClass;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem listItem) {
        if(root==null) {
            root=listItem;
            return true;
        }
        ListItem currentItem = root;
        while(currentItem != null) {
            int value=currentItem.compareTo(listItem);
            if(value==0){
                return false;
            }
            else if(value > 0) {
                if(currentItem.previous()==null) {
                    listItem.setNext(currentItem).setPrevious(listItem);
                    root=listItem;
                }
                else {
                    currentItem.previous().setNext(listItem).setPrevious(currentItem.previous());
                    currentItem.setPrevious(listItem).setNext(currentItem);
                }
                return true;
            }
            else {
                if(currentItem.next()==null) {
                    currentItem.setNext(listItem).setPrevious(currentItem);
                    return true;
                }
                currentItem=currentItem.next();
            }
        }
        return false;
    }

    public boolean removeItem(ListItem listItem) {
        if (listItem == null) {
            return false;
        }
        ListItem currentItem = root;
        while(currentItem!=null) {
            int value = currentItem.compareTo(listItem);
            if(value == 0) {
                if(currentItem==root) {
                    root=currentItem.next();
                }
                else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            else if(value < 0) {
                currentItem=currentItem.next();
            }
            else {  //value>0 i.e., the item doesn't exist in the list
                return false;
            }
        }
        return false;
    }

    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
            return;
        }
        while (root != null) {
            System.out.println(root.getValue());
            root=root.next();
        }
    }
}
