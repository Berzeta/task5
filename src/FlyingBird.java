public abstract class FlyingBird extends Bird {

  public void checkWings() {
    birdName = this.getClass().getSimpleName();
    System.out.println("The " + birdName + " wings are checked");
  }
}