import java.util.Comparator;

public class CompareToy implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return (int) (o1.getDropFrequency() - o2.getDropFrequency());

    }

}
