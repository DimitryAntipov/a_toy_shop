public class Toy implements Comparable<Toy> {
    protected String name;
    protected float dropFrequency;
    protected int id;

    public Toy(String name, float dropFrequency, int id) {

        this.name = name;
        this.dropFrequency = dropFrequency;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Игрушка [Название=" + name + ", частота выпадания=" + dropFrequency + ", id=" + id + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(float dropFrequency) {
        this.dropFrequency = dropFrequency;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Toy o) {
        return (int) (o.dropFrequency - this.dropFrequency);

    }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((name == null) ? 0 : name.hashCode());
    // result = prime * result + amount;
    // result = prime * result + price;
    // return result;
    // }

}
