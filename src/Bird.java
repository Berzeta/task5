public abstract class Bird {

  public String birdName;

  public void eat() {
    birdName = this.getClass().getSimpleName();
    System.out.println("The " + birdName + " bird is eating");
  }
}