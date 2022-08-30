import java.util.List;

public class Zoo {


  public static void feed(List<? extends Bird> list) {
    System.out.println("Feeding birds");
    for (Bird value : list) {
      value.eat();
    }
  }


  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting a bird to a section");
    bird.checkWings();
    list.add(bird);
    System.out.println(list);
  }

  public static void registerBird(List<Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    System.out.println(list);
  }
}