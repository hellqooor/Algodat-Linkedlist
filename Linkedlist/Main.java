public class Main {
    public static void main(String[] args) {
        LiList list = new LiList();

        list.autoinsert(11);
        list.autoinsert(21);
        list.autoinsert(2);
        list.autoinsert(56);
        list.autoinsert(1);

        list.specinsert(33,5);

        list.traversal();

        list.search(56);
        list.delete(11);
        
        list.sorting();
        list.traversal();

    }
}