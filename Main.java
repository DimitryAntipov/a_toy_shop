import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object shop3[] = new Object[3];

        Shop shop = new Shop();
        shop.addToy(new Toy("Manky", 100.0f, 2));
        shop.addToy(new Toy("Dog", 120.0f, 1));
        shop.addToy(new Toy("Pig", 130.0f, 5));
        shop.addToy(new Toy("Cat", 110.0f, 3));
        shop.addToy(new Toy("Cat", 160.0f, 3));

        System.out.println("Добро пожаловать в магазин!");
        System.out.println("Для просмотра списка допустимых команд введите h");

        Scanner iScanner = new Scanner(System.in);

        while (true) {
            String userInput = iScanner.nextLine();
            if (userInput.equals("h")) {
                System.out.println("""
                        h                  -> распечатать список допустимых команд (help)
                        a                  -> добавить новую игрушку (add)
                        s                  -> показать все игрушки в магазине (showProduct)
                        c                  -> изменить частоту выпадения игрушки
                        p                  -> определить призовые игрушки
                        t                  -> получение призовой игрушки (сначала нужно определить призовые игрушки)
                        s                  -> выйти
                        """);
                System.out.println("Введите команду");

            } else if (userInput.equals("a")) {
                System.out.println("Введите id игрушки:");
                int userInput2 = iScanner.nextInt();
                System.out.println("Введите назнавние игрушки:");
                String userInput3 = iScanner.nextLine();
                String userInput5 = iScanner.nextLine();
                System.out.println("Введите коэффициент:");
                Float userInput4 = iScanner.nextFloat();
                shop.createToy(userInput5, userInput4, userInput2);
                System.out.println("Игрушка добавлена!\n Введите команду");

            } else if (userInput.equals("s")) {
                shop.showProduct();

            } else if (userInput.equals("q")) {
                System.exit(0);
            } else if (userInput.equals("c")) {
                System.out.println("Укажите id игрушки в которой вы хотите изменить частоту выпадения:");
                int userInput6 = iScanner.nextInt();
                System.out.println("Укажите новую частоту выпадания игрушки:");
                Float userInput7 = iScanner.nextFloat();
                shop.changeWeight(userInput6, userInput7);
            } else if (userInput.equals("p")) {
                Object[] shop2 = Shop.convertToSet().toArray();

                for (int i = 0; i < 3; i++) {
                    shop3[i] = shop2[i];
                }
                System.out.println("Призовые игрушки:");
                for (Object o : shop3) {
                    System.out.println(o);
                }
            } else if (userInput.equals("t")) {

                TxtWriterToFile txtWriterToFile = new TxtWriterToFile(shop3[0]);

                txtWriterToFile.writerToFile();

                String tmp = shop3[0].toString();

                String[] parts = tmp.split("id=");
                int id = Integer.parseInt(parts[parts.length - 1].substring(0, parts[parts.length - 1].length() - 1).trim());
                System.out.println(id);
                shop.remProduct(id);
                System.out.println("Игрушка досталась победителю (fyle.txt), игрушка удалена из магазина");

            }
        }

    }

}
