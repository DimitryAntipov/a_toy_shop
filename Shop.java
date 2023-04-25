import java.util.*;

public class Shop {

    private static ArrayList<Toy> shop = new ArrayList<Toy>();

    Scanner iSkaner = new Scanner(System.in);

    public void addToy(Toy product) {
        shop.add(product);
    }

    public int choiceToy() {
        System.out.println("Выберите игрушку");
        int productNumber = iSkaner.nextInt();
        return productNumber;
    }

    public Toy showProduct() {
        for (Toy toy : shop) {
            System.out.println(toy);
        }
        return null;

    }

    public Toy createToy(String name, float pr, int id) {
        Toy toy = new Toy(name, pr, id);
        shop.add(toy);
        ;

        return toy;

    }

    public Toy changeWeight(int id, Float newDF) {
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                shop.get(i).setDropFrequency(newDF);
            }

        }
        return null;

    }

    public static Set<Toy> convertToSet() {
        Set<Toy> items = new TreeSet<>();
        for (Toy e : shop) {
            items.add(e);
        }
        return items;
    }

    public Toy remProduct(int id) {

        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).id == id) {
                shop.remove(shop.get(i));

            }
        }
            
        
        return null;

    }

    

}
