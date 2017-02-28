package com.sharipov;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static final int HEIGHT = 100;

    public static void main(String[] args) {
	    String fileName = args[0];
	    String outputFileName = args[1];
        System.out.println(fileName + " " + outputFileName);
        Queue<String> stringList = new LinkedList<>();
        try {
            Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).forEach(s -> stringList.add(s));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stringList.forEach(System.out::println);
        int numberOfTrees = 0;
        String firstString = stringList.poll();

        Transmitter transmitter = new Transmitter();
        String[] array = firstString.split(" ");
        transmitter.setY(Integer.parseInt(array[0]));
        System.out.println(transmitter.getY());
        numberOfTrees = Integer.parseInt(array[1]);
        if (numberOfTrees != stringList.size()) {
            System.out.println("Неверный файл конфигурации. Проверьте количество деревьев!");
        }
        System.out.println(numberOfTrees);
        List<Tree> trees = new ArrayList<>();
        stringList.forEach(s -> {
            String[] array2 = s.split(" ");
            trees.add(new Tree(Integer.parseInt(array2[0]), Integer.parseInt(array2[1]), Integer.parseInt(array2[2])));

        });
        List<Shadow> shadows = new ArrayList<>();
        trees.forEach(tree -> {
            int begin = 0;
            int end = 0;
            begin = HEIGHT * (tree.getY() - tree.getR() - transmitter.getY()) / tree.getX() + transmitter.getY();
            end = HEIGHT * (tree.getY() + tree.getR() - transmitter.getY()) / tree.getX() + transmitter.getY();
            shadows.add(new Shadow(begin, end));

        });

        shadows.forEach(System.out::println);
        Collections.sort(shadows, Comparator.comparing(Shadow::getBegin));

        shadows.forEach(System.out::println);


    }
}
