import java.util.Random;

public class MagicBox<T> {
    private final T[] items;
    private final Random random = new Random();

    public MagicBox(int count) {
        items = (T[]) new Object[count];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() throws RuntimeException {
        int leftToFill = 0;

        for (T item : items) {
            if (item == null) {
                leftToFill++;
            }
        }

        if (leftToFill > 0) {
            throw new RuntimeException("Коробка не полна. Осталось заполнить ячеек: " + leftToFill);
        }

        int randomInt = random.nextInt(items.length);

        return items[randomInt];
    }
}
