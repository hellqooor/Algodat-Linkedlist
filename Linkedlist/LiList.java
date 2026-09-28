public class LiList {
    Node head = null;
    Node tail = null;

    public void autoinsert(int newb){
        Node nodeBaru = new Node(newb);
        
        if (head == null){
            head = nodeBaru;
            tail = nodeBaru;
        }
        else{
            nodeBaru.nextNode = head;
            head = nodeBaru;
        }
    }

    public void specinsert(int newb, int index){
        if(index == 0){
            autoinsert(newb);
            return;
        }
        Node nodeBaru = new Node(newb);
        Node temp = head;

        for(int i = 0 ; i < index - 1; i++ ){
            if(temp == null){
                System.out.println("Index doesn't exist");
                return;
            }
            temp = temp.nextNode;
        }

        nodeBaru.nextNode = temp.nextNode;
        temp.nextNode = nodeBaru;

        if(nodeBaru.nextNode == null){
            tail = nodeBaru;
        }
    }

    public void delete(int num){
        if (head == null){
            System.out.println("Empty");
            return;
        }
        if(head.wlist == num){
            head = head.nextNode;
            if (head == null) tail = null;
            return;
        }
        Node temp = head;
        while (temp.nextNode != null && temp.nextNode.wlist != num){
            temp = temp.nextNode;
        }
        if (temp.nextNode == null) {
            System.out.println("Number " + num + " doesn't exist.");
            return;
        }
        if (temp.nextNode == tail) {
            tail = temp;
        }
        temp.nextNode = temp.nextNode.nextNode;
    }
    public void traversal(){
        if(head == null){
            System.out.println("No number yet");
            return;
        }
        System.out.println("Number : ");
        Node temp = head;
        while (temp != null){
            System.out.print("[" + temp.wlist + "] -> ");
            temp = temp.nextNode;
        }
        System.out.println("null");
    }
    public void search(int num) {
        Node temp = head;
        int position = 0;
        boolean finder = false;

        while (temp != null) {
            if (temp.wlist == num) {
                System.out.println("Number " + num + " is in the index " + position);
                finder = true;
                break;
            }
            temp = temp.nextNode;
            position++;
        }
        if (!finder) {
            System.out.println("Number " + num + " didnt exist");
        }
    }
    public void sorting() {
        if (head == null || head.nextNode == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.nextNode != null) {
                if (current.wlist > current.nextNode.wlist) {
                    int tempValue = current.wlist;
                    current.wlist = current.nextNode.wlist;
                    current.nextNode.wlist = tempValue;
                    swapped = true;
                }
                current = current.nextNode;
            }
        } while (swapped);
        System.out.println("Success sorting the List ");
    }
}