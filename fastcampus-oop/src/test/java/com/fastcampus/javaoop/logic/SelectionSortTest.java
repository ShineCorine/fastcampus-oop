package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {


    @DisplayName("선택정렬 - 리스트를 넣으면 정렬된 결과를 리턴")
    @Test
    void given_list_WhenExcuting_ThenReturnSortedList(){

        SelectionSort<Integer> selectionSort = new SelectionSort<>();

        List<Integer> actual = selectionSort.sort(List.of(3, 3, 2, 4, 5, 1));

        assertEquals(List.of(1,2,3,3,4,5), actual);

    }

}