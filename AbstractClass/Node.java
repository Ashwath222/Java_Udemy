package AbstractClass;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    ListItem next() {
        return rightLink;
    }

    ListItem setNext(ListItem item) {
        rightLink=item;
        return rightLink;
    }

    ListItem previous() {
        return leftLink;
    }

    ListItem setPrevious(ListItem item) {
        leftLink=item;
        return leftLink;
    }

    int compareTo(ListItem item) {
        return ((String)getValue()).compareTo((String) item.getValue());
    }
}
