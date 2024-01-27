
class MyCylinder {

  private float radius;
  private float height;

  public MyCylinder(float radius, float height) {
    this.radius = radius;
    this.height = height;
  }

  public float getHeight() {
    return height;
  }

  public float getRadius() {
    return radius;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  public float Volume() {
    return (float) (Math.PI * radius * radius * height);
  }

  public float SurfaceArea() {
    return (float) (2 * Math.PI * radius * (radius + height));
  }

}

public class Practice3 {
  public static void main(String[] args) {

    MyCylinder c = new MyCylinder(10.5f, 5.5f);

    System.out.println("Height: " + c.getHeight());
    System.out.println("Radius: " + c.getRadius());
    System.out.println("Volume: " + c.Volume());
    System.out.println("Surface Area: " + c.SurfaceArea());
  }
}
