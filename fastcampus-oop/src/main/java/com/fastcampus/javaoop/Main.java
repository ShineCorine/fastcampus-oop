package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.SelectionSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
         Sort<String> sort = new SelectionSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
