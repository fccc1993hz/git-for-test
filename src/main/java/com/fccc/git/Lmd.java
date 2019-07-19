package com.fccc.git;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by fccc on 2019/4/25
 */
public class Lmd {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "scala", "python");
        languages.forEach((String language) -> System.out.println(language));

        List<Double> costs = Arrays.asList(10.0, 20.0, 30.0);
        costs.stream().map(cost -> cost + cost * 0.05).forEach(x -> System.out.println(x));

        List<Double> costs2 = Arrays.asList(10.0, 20.0, 30.0);
        double allCost = costs2.stream().map(cost -> cost + cost * 0.05).reduce((sum, cost) -> sum + cost).get();
        System.out.println(allCost);

        List<String> names = new ArrayList<>();
        names.add("Tmall");
        names.add("Alipay");
        List<String> lowercaseNames = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowercaseNames);

    }
}
