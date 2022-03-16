package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Node[] n = new Node[10];
        for(int i=0; i<10; i++) {
            n[i]=new Node(""+i);
        }
        SearchTree s = new SearchTree(n[5]);
        for (int i=0; i<10; i++) {
            s.addItem(n[i]);
        }
        s.removeItem(n[8]);
        s.traverse(n[0]);
    }
}
