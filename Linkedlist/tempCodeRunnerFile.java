public class LiList {
    Node head = null;
    Node tail = null;

    public void tambah(int baru){
        Node nodeBaru = new Node(baru);
        
        if(head == null){
            head = nodeBaru;
            tail = nodeBaru;
        }
        else{
            tail.nextNode = nodeBaru;
            tail = nodeBaru;
        }
    System.out.println(baru);
    }

    public void hapus(){
        if (head == null){
            System.out.println("empty");
        }
        else{
            head = head.nextNode;
        }
        if (head == null){
            tail = null;
        }
    }

    public void lihat(){
        if (head == null) {
            System.out.println("Daftar antrean kosong.");
            return;
        }

        System.out.print("Daftar Antrean Saat Ini: ");
        Node temp = head; 
        
        while (temp != null) {
            System.out.print("[" + temp.waitinglist + "] -> ");
            temp = temp.nextNode; 
        }
        System.out.println("null");
    
    }

}
