package AbstractClass;

public class SearchTree implements  NodeList{
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem listItem) {
        if( root == null){
            root=listItem;
            return true;
        }
        ListItem currentItem=root;
        while(currentItem != null) {
            int value = currentItem.compareTo(listItem);
            if(value == 0) {
                return false;
            }
            if(value > 0) {
                if(currentItem.previous() == null) {
                    currentItem.setPrevious(listItem);
                    return true;
                }
                currentItem=currentItem.previous();
            }
            else {
                if(currentItem.next() == null) {
                    currentItem.setNext(listItem);
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
        ListItem currentItem=root, parentItem=currentItem;
        while(currentItem != null) {
            int value = currentItem.compareTo(listItem);
            if(value == 0) {
                performRemoval(currentItem,parentItem);
                return true;
            }
            else if(value > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else {
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
        }
        return false;
    }

    private void performRemoval(ListItem listItem, ListItem parentItem) {
        if(listItem.next() == null) {
            if (parentItem.next() == listItem) {
                parentItem.setNext(listItem.previous());
            }
            else if (parentItem.previous() == listItem) {
                parentItem.setPrevious(listItem.previous());
            }
            else {
                root = listItem.previous();
            }
        }
        else if(listItem.previous() == null) {
            if(parentItem.next() == listItem) {
                parentItem.setNext(listItem.next());
            }
            else if (parentItem.previous() == null) {
                parentItem.setPrevious(listItem.next());
            }
            else {
                root = listItem.next();
            }
        }
        else {
            ListItem currentItem = listItem.next(), leftParent = listItem;
            while (currentItem.previous() != null) {
                leftParent = currentItem;
                currentItem = currentItem.previous();
            }
            listItem.setValue(currentItem.getValue());
            if(leftParent == listItem) {
                listItem.setNext(currentItem.next());
            }
            else {
                leftParent.setPrevious(currentItem.next());
            }
        }
    }

    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
