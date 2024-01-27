
class rectOperation {

  private float height;
  private float width;

  public rectOperation() {
    this.height = 4;
    this.width = 5;
  }

  public rectOperation(float height, float width) {
    this.height = height;
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  public float getWidth() {
    return width;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public void setWidth(float width) {
    this.width = width;
  }

}

public class Practice4 {
  public static void main(String[] args) {

    rectOperation rect1 = new rectOperation();
    rectOperation rect2 = new rectOperation(5, 6);
    System.out.println("rect1: " + rect1.getHeight() + " " + rect1.getWidth());
    System.out.println("rect2: " + rect2.getHeight() + " " + rect2.getWidth());
  }
}
