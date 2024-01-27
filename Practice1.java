package week2_day4;
class Cylinder {

    private float radius;
    private float height;
  
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
  
  }
  
  public class Practice1 {
    public static void main(String[] args) {
  
      Cylinder c = new Cylinder();
      c.setHeight(10.5f);
      c.setRadius(5.5f);
      System.out.println(c.getHeight());
      System.out.println(c.getRadius());
    }
  
  }