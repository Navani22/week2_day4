package week2_day4;

class Sphere {

    private float radius;
  
    public float getRadius() {
      return radius;
    }
  
    public void setRadius(float radius) {
      this.radius = radius;
    }
  
  }
  
  public class Practice5 {
    public static void main(String[] args) {
  
      Sphere c = new Sphere();
      c.setRadius(5.5f);
      System.out.println(c.getRadius());
    }
  
  }