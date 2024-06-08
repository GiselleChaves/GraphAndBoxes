public class Box {
  private int width, height, length;
  
  public Box(int width, int height, int length) {
    this.width = width;
    this.height = height;
    this.length = length;
  }

  public boolean canBeInside(Box otherBox) {
    boolean canBeInside = false;
    if((this.width < otherBox.width) && (this.height < otherBox.length) && (this.length < otherBox.length)){
      canBeInside = true;
    }
      return canBeInside;
  } 
}
