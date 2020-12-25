package ru.vsu.fedosova.common;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public List<Integer> createNewList(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        int valueBefore = 0;
        for (Integer value : list) {
            if (value != valueBefore) {
                newList.add(value);
                valueBefore = value;
            }
        }
        return newList;
    }
}
