package ru.sayakhov;

import java.util.ArrayList;

public class Main {
// Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.

// public Set<String> removeEvenLength(Set<String> set);

// Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
    public static void main(String[] args) {
        ArrayList<String> listWords = new ArrayList<String>();

        listWords.add("foo");
        listWords.add("buzz");
        listWords.add("bar");
        listWords.add("fork");
        listWords.add("bort");
        listWords.add("spoon");
        listWords.add("!");
        listWords.add("dude");
        listWords.add("food");

        System.out.println(listWords);
        System.out.println(removeEvenLength(listWords));
    }
    public static ArrayList<String> removeEvenLength(ArrayList<String> ring){
        ArrayList<String> newArrayList = new ArrayList<String>();
        for (int i = 0; i < ring.size()-1; i++) {
            if(ring.get(i).length() % 2 == 1){
                newArrayList.add(ring.get(i));
            }
        }
        return newArrayList;
    }
}
