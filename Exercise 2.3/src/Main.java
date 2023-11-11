import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        var fruitList = new LinkedList<Fruit>();
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Mango"));
        fruitList.add(new Fruit("Pineapple"));
        fruitList.add(new Fruit("Strawberry"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Grapefruit"));

        for(var val : fruitList){
            System.out.println(val);
        }

        fruitList.addFirst(new Fruit("Kiwifruit")); //Grape
        fruitList.addLast(new Fruit("Grape")); //Kiwifruit
        System.out.println("---------------------------------");
        for(var val : fruitList){
            System.out.println(val);
        }
    }
}
