package behavioral.iterator;

public class LambRunner {
    public static void main(String[] args) {
        String[] lambs = {"Dolly", "Anna", "Nina", "Polina"};
        Herd herd = new Herd("First", lambs);
        Iterator iterator = herd.getIterator();
        System.out.println("Developer" + herd.getNameHerd());
        System.out.println("Lambs:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
