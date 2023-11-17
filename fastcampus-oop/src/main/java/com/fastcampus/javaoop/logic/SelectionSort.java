package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for(int i=0;  i < output.size() ; i++){
            int lowestIndex = indexLowest(output,i);
            swap(output, i, lowestIndex);
        }
        return output;
    }

    public void swap(List<T> list, int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public int indexLowest(List<T> list, int startIdx){
        int lowIndex = startIdx;
        for(int i = startIdx; i < list.size(); i++){
            if (list.get(i).compareTo(list.get(lowIndex)) < 0){
                lowIndex = i;
            }
        }
        return lowIndex;
    }
}
