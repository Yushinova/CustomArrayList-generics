package org.top;

import org.top.generic.CustomArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void testCustomArrayList() {
        CustomArrayList list = new CustomArrayList();
        System.out.println(list.toString());
        String str = "Hi";
        list.setElementByIndex(0, str);
        System.out.println(list.toString());
        Object obj = "Mom";
        list.addElement(obj);
        System.out.println(list.toString());
        System.out.println(list.getElementByIndex(1));
        list.deleteEnd();
        System.out.println(list.toString());
        list.shrinkOrGrow(0);
        System.out.println(list.toString());
        list.shrinkOrGrow(10);
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        testCustomArrayList();
    }
}