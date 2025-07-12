private class Node<T> {
    T object;
    Node<T> next;

    Node (T object, Node<T> next) {
        this.object = object;
        this. next = next;
    }

    public T getObject() {
        return object;
    }

    public Node<T> getNext() {
        return next;
    } 

    
}
