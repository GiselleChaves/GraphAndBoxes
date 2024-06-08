import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
  private String filePath;

  public FileReader(String filePath) {
    this.filePath = filePath;
  }

  // Method to read data for nested boxes
  public List<Box> readBoxes() throws IOException {
    List<Box> boxes = new ArrayList<>();
    try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] dimensions = line.split(" ");
        int width = Integer.parseInt(dimensions[0]);
        System.out.println(dimensions[0]);
        int height = Integer.parseInt(dimensions[1]);
        System.out.println(dimensions[1]);
        int length = Integer.parseInt(dimensions[2]);
        System.out.println(dimensions[2]);
        boxes.add(new Box(width, height, length));
      }
    }
    return boxes;
  }
}