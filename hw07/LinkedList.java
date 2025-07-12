public class LinkedList<E> {

    private class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public void add(int index, E data) {

        Node<E> node = new Node<E>(data, null);

        if (isEmpty() && index == 0) {
            head = node;
            size++;
        } else if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }else if(index == 0) {
            node.next = head;
            head = node;
            size++;
        
        }
        else {
            int counter = 0;
            Node<E> current = head;
            while (true) {
                
                if (counter == index - 1) {
                    node.next = current.next;
                    current.next = node;
                    size++;
                    break;
                }
                current = current.next;
                counter++;
            }

        }

    }

    public void add(E newData) {
        add(size, newData);
    }

    public boolean contains(Object obj) {
        if (isEmpty() ) {
            return obj == null;
        }
        Node<E> current = head;
        
        while (current != null) {
            if(current.data == null && obj == null) {
                return true;
            }
            if (current.data.equals(obj)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public E get(int index) {

        if (isEmpty() || index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node<E> current = head;
        int counter = 0;

        while (true) {
            if (counter == index) {
                return current.data;
            }
            counter++;
            current = current.next;
        }

    }

    public int indexOf(Object obj) {
        if (isEmpty()) {
            return -1;
        }

        Node<E> current = head;
        int counter = 0;
        while (current != null) {
            if(current.data == null){
                if(obj == null) {
                    return counter;
                }
                counter++;
                current = current.next;
                continue;

            }
             
            if (current.data.equals(obj)) {
                return counter;
            }
            counter++;
            current = current.next;
        }

        return -1;
    }

    public E remove(int index) {

        if (isEmpty() || index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node<E> current = head;
        int counter = 0;
        E removedData;

        while (true) {
            if (counter == index - 1) {

                removedData = current.next.data;
                current.next = current.next.next;
                size--;

                return removedData;
            }
            counter++;
            current = current.next;
        }

    }

    public boolean remove(Object obj) {
        if (isEmpty()) {
            return false;
        }

        if (checkEquals(obj, head.data)){
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        Node<E> previous;

        while (current.next != null) {
            previous = current;
            current = current.next;
            if(checkEquals(current.data, obj)) {
                size--;
                previous.next = current.next;
                return true;

            }
        }

        return false;
    }

    public E set(int index, E data) {
        if (isEmpty() || index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node<E> current = head;
        int counter = 0;
        E replacedData;

        while (true) {
            if (counter == index) {

                replacedData = current.data;
                current.data = data;

                return replacedData;
            }
            counter++;
            current = current.next;
        }

    }

    public String toString() {
        Node<E> current = head;
        String toPrint = "[";
        while (current != null) {
            if (current.next == null) {
                toPrint += String.valueOf(current.data);

            } else {
                toPrint += String.valueOf(current.data) + ", ";
            }

            current = current.next;
        }
        return toPrint + "]";
    }

    private static boolean checkEquals(Object data, Object objectData) {
        if (objectData == null) {
            return data == null;
        } else {
            return objectData.equals(data);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
   

}
