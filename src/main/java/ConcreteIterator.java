import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Object> items;
    private int position;

    public ConcreteIterator(List<Object> items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        Object item = items.get(position);
        position++;
        return item;
    }
}