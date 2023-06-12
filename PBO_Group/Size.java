// Contoh kelas immutable
public final class Size<T> {
    private final T x;
    private final T y;
    
    public Size(T x, T y) {
        this.x = x;
        this.y = y;
    }
    
    public T getX() {
        return x;
    }
    
    public T getY() {
        return y;
    }
}
