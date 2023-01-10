import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox("Box 1", 10));
        boxes.add(new HeavyBox("Box 2", 20));
        boxes.add(new HeavyBox("Box 3", 30));


        for (HeavyBox box : boxes) {
            System.out.println(box.getName() + ": " + box.getWeight());
        }

        boxes.get(0).setWeight(11);

        boxes.remove(boxes.size() - 1);

        for (HeavyBox box : boxes) {
            System.out.println(box.getName() + ": " + box.getWeight());
        }

        boxes.clear();
    }

}