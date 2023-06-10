// Contoh penggunaan generic dan interface
public class ArrayStack<E> implements Stack<E> {
    private Object[] elements;
    private int top;
    
    public ArrayStack(int capacity) {
        elements = new Object[capacity];
        top = -1;
    }
    
    public void push(E element) {
        elements[++top] = element;
    }
    
    @SuppressWarnings("unchecked")
    public E pop() {
        return (E) elements[top--];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
}
