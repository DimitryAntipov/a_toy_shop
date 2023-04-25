import java.io.*;

public class TxtWriterToFile extends WriterToFile {
    String text = "";
    private Object toys;

    public TxtWriterToFile(Object shop3) {
        this.toys = shop3;
    }

    @Override
    public Toy writerToFile() {

        {
            text += toys;

        }

        try (FileWriter writer = new FileWriter("file.txt", true)) {
            // запись всей строки

            writer.write(text);
            // запись по символам
            // writer.append('\n');
            // writer.append('E');

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        return null;
    }

}
