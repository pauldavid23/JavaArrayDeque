import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> j = new ArrayDeque<>();

        j.add(1);
        j.offerLast(3);
        j.offerLast(2);

        System.out.println(j);

    }
}