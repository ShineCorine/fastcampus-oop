package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new SelectionSort<String>());

    @Test
    void test(){

        List<String> actual = sut.doSort(List.of("3", "5", "1"));

        assertEquals(List.of("1", "3", "5"), actual);
    }

}