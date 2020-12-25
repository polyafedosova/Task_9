package ru.vsu.fedosova.gui.listener;

import ru.vsu.fedosova.utils.ListUtils;
import ru.vsu.fedosova.common.SortList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ApplyButtonListener implements ActionListener {
    private JTextField inputList;
    private JTextField outputSortedList;

    public ApplyButtonListener(JTextField inputList, JTextField outputSortedList)
    {
        this.inputList = inputList;
        this.outputSortedList = outputSortedList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ListUtils listUtils = new ListUtils();
        SortList sortList = new SortList();
        int[] array = ListUtils.toIntArrayFromFile(inputList.getText());
        List<Integer> list = listUtils.addArrayElementsToList(array);
        outputSortedList.setText(ListUtils.toString(sortList.createNewList(list)));
    }
}
