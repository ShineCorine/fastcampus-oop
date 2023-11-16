package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        SelectionSort<String> sort = new SelectionSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
