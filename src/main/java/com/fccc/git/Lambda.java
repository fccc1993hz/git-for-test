package com.fccc.git;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fccc on 2019/4/23
 */
public class Lambda {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};
        List<String> players = Arrays.asList(atp);

        // Old looping
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println("");

        /**
         * default void forEach(Consumer<? super T> action) {
         Objects.requireNonNull(action);
         for (T t : this) {
         action.accept(t);
         }
         }
         * */

        // Using lambda expression and functional operations
        players.forEach((String player) -> System.out.print(player + "? "));
        System.out.println("");

        // Using double colon operator in Java 8
        players.forEach(System.out::print);
        System.out.println("");

        // Using anonymous innerclass  实现匿名函数类的时候 如果参数列表中有参数 那么其就应该在使用lambda的时候就加上参数
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        // Using lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

        // Using anonymous innerclass
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // Using lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

        // Run em!
        race1.run();
        race2.run();


        String[] players2 = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};

        // Show the list of players
        System.out.print("Show the list of players:\n");
        Arrays.asList(players2).forEach((player) -> System.out.print(player + "|"));

        // Sort players by name using anonymous innerclass   //Comparator是接口类型
        Arrays.sort(players2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        // Sort players by name using lambda expression
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(players2, sortByName);
        // or this
        Arrays.sort(players2, (String s1, String s2) -> (s1.compareTo(s2)));

        System.out.print("\nShow the list of players after sorting by name:\n");
        Arrays.asList(players).forEach((player) -> System.out.println(player));

        // Sort players by surname using anonymous innerclass
        Arrays.sort(players2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
            }
        });

        // Sort players by surname using lambda expression  //根据姓开始字母顺序进行排序
        Comparator<String> sortBySurname = (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
        Arrays.sort(players2, sortBySurname);
        // or this
        Arrays.sort(players2, (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")))));

        System.out.print("\nShow the list of players after sorting by surname:\n");
        Arrays.asList(players).forEach((player) -> System.out.println(player));

        // Sort players by name lenght using anonymous innerclass
        Arrays.sort(players2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });

        // Sort players by name lenght using lambda expression
        Comparator<String> sortByNameLenght = (String s1, String s2) -> (s1.length() - s2.length());
        Arrays.sort(players2, sortByNameLenght);
        // or this
        Arrays.sort(players2, (String s1, String s2) -> (s1.length() - s2.length()));

        System.out.print("\nShow the list of players after sorting by length:\n");
        Arrays.asList(players2).forEach((player) -> System.out.println(player));

        // Sort players by last letter using anonymous innerclass
        Arrays.sort(players2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
            }
        });

        // Sort players by last letter using lambda expression
        Comparator<String> sortByLastLetter = (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(players2, sortByLastLetter);
        // or this
        Arrays.sort(players2, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));

        System.out.print("\nShow the list of players after sorting by last letter:\n");
        Arrays.asList(players2).forEach((player) -> System.out.println(player));

    }
}
