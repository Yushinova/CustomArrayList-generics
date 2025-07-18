package org.top;

import org.top.generic.CustomArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void testCustomArrayList() {
        CustomArrayList list = new CustomArrayList();
        System.out.println("Добавление элемента по индексу");
        String str = "Hi";
        list.setElementByIndex(0, str);
        System.out.println(list.toString());
        System.out.println("Добавление элемента в конец");
        Object obj = "Mom";
        list.addElement(obj);
        System.out.println(list.toString());
        System.out.println("Получение элемента по индексу 1");
        System.out.println(list.getElementByIndex(1));
        System.out.println("Удаление элемента с конца");
        list.deleteEnd();
        System.out.println(list.toString());
        System.out.println("Уменьшение до 0");
        list.shrinkOrGrow(0);
        System.out.println(list.toString());
        System.out.println("Увеличение до 10");
        list.shrinkOrGrow(10);
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        testCustomArrayList();
    }
}