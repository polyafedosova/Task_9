package ru.vsu.fedosova.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.fedosova.common.SortList;
import ru.vsu.fedosova.utils.ListUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleTest {

    @Test
    public void testCreateNewList1() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input1.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList2() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input2.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList( ));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList3() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input3.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList4() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input4.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(7, 8, 2, 3, 0, 3));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList5() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input5.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(7, 9, 7));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList6() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input6.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(666, 6));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList7() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input7.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(1, 2, 22, 333, 444, 5, 1, 2, 888));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList8() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input8.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(1));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList9() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input9.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(1212, 2121, 1212));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testCreateNewList10() throws FileNotFoundException {
        SortList sortList = new SortList();
        List<Integer> inputList = ListUtils.readListFromFile("tests\\input10.txt");
        List<Integer> actualSortedList = sortList.createNewList(inputList);
        List<Integer> expectedSortedList = new ArrayList<>(Arrays.asList(2, 11, 2, 3, 2, 6, 2, 3, 10));
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }
}