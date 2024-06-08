import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        String filePath = "boxes.txt";
        FileReader fileReader = new FileReader(filePath);
        Graph graph = new Graph();
        List<Box> boxes = fileReader.readBoxes();
        
        graph.toString();
    }
}
