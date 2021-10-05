public class MainClass {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(70);

        list.insertAt(2,40);

        list.show();
    }
}
