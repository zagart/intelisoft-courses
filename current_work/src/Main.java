import java.util.*;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class Main {

    private static Map<String, Comparator> map = new HashMap<>();

    public static void main(String...args) {

        /**
         * Realization of Comparator interface.
         */
//        map.put("age", new CompareUserByAge());
//        map.put("name", new CompareUserByName());
//
//        User[] users = new User[]{new User("Sveta",36), new User("Denis", 34), new User("Artiom",42)};
//
//        System.out.println(Arrays.deepToString(users));
//
//        SortUtil.sort(users, map.get(args[0]));
//
//        System.out.println(Arrays.deepToString(users));

        /**
         * HashMap example.
         */
//        Map<Integer, User> map = new HashMap<>();
//        map.put(1, new User("Sveta",36));
//        map.put(2, new User("Denis", 34));
//        map.put(3, new User("Artiom",42));
//
//        for (Map.Entry<Integer, User> entry: map.entrySet()) {
//            System.out.println(entry.getValue());
//        }


        Random rnd = new Random();
        TreeSet<Point> set = new TreeSet<>((p1,p2) -> p1.getX() - p2.getX());
        for (int i = 0; i < 100000; i++) {
            set.add(new Point(rnd.nextInt(1000), rnd.nextInt(1000)));
        }
        System.out.println(set.subSet(new Point(10,10), new Point(20,20)));

    }



}
