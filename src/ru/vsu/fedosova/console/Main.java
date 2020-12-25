package ru.vsu.fedosova.console;

import ru.vsu.fedosova.utils.ListUtils;
import ru.vsu.fedosova.common.SortList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = ListUtils.readListFromFile(readFile());
        if (list == null) {
            System.out.printf("Error! Can't read file");
        } else {
            SortList logic = new SortList();
            List<Integer> newList = logic.createNewList(list);
            writeFile(newList);
        }
    }

    public static String readFile() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the full path to the file containing the matrix");
        String pathInputFile = scanner1.nextLine();
        File inputFile = new File(pathInputFile);
        try {
            scanner1 = new Scanner(inputFile);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
        return pathInputFile;
    }

    public static void writeFile(List<Integer> newList) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the full path to the file where you want to save the processed matrix");
        String pathOutputFile = scanner2.nextLine();
        File outputFile = new File(pathOutputFile);
        try {
            scanner2 = new Scanner(outputFile);
            ListUtils.writeListToFile(newList, pathOutputFile);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
    }
}
