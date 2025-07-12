public class GenericLinkedList<E> {
    
    private class Node<E> {
        E data;
        Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;

    public GenericLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(E newData) {
        head = new Node<E>(newData, head);
    }

    public void addToRear(E newData) {
        Node<E> node = new Node<E>(newData, null);
        Node<E> current = head;
        if (isEmpty()) {
            head = node;
        } else {
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;            
        }
    }

    public String toString() {
        Node<E> current = head;
        String toPrint = "";
        while(current!= null) {
            toPrint += current.data.toString() + "\n";
            current = current.next;
        }
        return toPrint;
    }

    public boolean contains(E data) {
        if (isEmpty()) {
            return false;
        }

        Node<E> current = head;

        while(current != null) {
            if(current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public E removeFromFront() {
        if(isEmpty()) {
            return null;
        }
        E removedData = head.data;
        head = head.next;
        return removedData;
    }

    public E removeFromRear() {
        E removedData;
        if(isEmpty()) {
            return null;
        }else if (head.next == null) {
            removedData = removeFromFront();
        }else {
            Node<E> current = head;

            while(current.next.next != null) {
                
                current = current.next;
            }
            removedData = current.next.data;
            current.next = null;
        }

        return removedData;

    }

    public static void main(String[] args) {
        GenericLinkedList<String> favBabySongs = new GenericLinkedList<>();
        favBabySongs.addToFront("Humpty Dumpty");
        // favBabySongs.addToRear("Swing Low Sweet Chariot");
        // favBabySongs.addToFront("Itsy Bitsy Spider");
        // favBabySongs.addToRear("Twinkle, Twinkle Little Star");
        // favBabySongs.addToFront("Wheels on the Bus");
        System.out.println(favBabySongs.toString());
        System.out.println();
        // System.out.println(favBabySongs.contains("Humpty Dumpty"));
        // System.out.println(favBabySongs.contains("Baby Shark"));
        System.out.println(favBabySongs.removeFromRear());
        System.out.println();
        System.out.println(favBabySongs);
        System.out.println(favBabySongs.isEmpty());
    }

    // public static void main(String[] args) {
    //     LinkedList<String> values = new LinkedList<>();
    //     values.add("A");
    //     values.add("B");
    //     values.add(null);
    //     values.add("B");
    //     values.add("A");
    //     values.add(null);
    //     values.add("B");
    //     values.add("A");
    //     System.out.println(values.remove("C"));
    //     System.out.println(values);
    //     System.out.println(values.remove(null));
    //     System.out.println(values);
    //     System.out.println(values.size());
    // }
}
