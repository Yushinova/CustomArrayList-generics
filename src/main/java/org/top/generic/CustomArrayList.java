package org.top.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {
    public Object[] list;

    public CustomArrayList() {
        list = new Object[0];
    }

    public CustomArrayList(Object[] list) {
        this.list = list;
    }

    public void setList(Object[] list) {
        this.list = list;
    }

    public Object[] getList() {
        return list;
    }

    public int getSize() {
        return list.length;
    }

    public void setElementByIndex(int index, Object object) {
        if (index > list.length || index < 0) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + list.length);
        }
        Object[] newList = new Object[list.length + 1];
        // Копируем элементы до индекса вставки
        System.arraycopy(list, 0, newList, 0, index);

        // Вставляем новый элемент
        newList[index] = object;

        // Копируем оставшиеся элементы
        System.arraycopy(list, index, newList, index + 1, list.length - index);
        list = newList;
    }

    public Object getElementByIndex(int index) {
        if (index > list.length || index < 0) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + list.length);
        }
        return list[index];
    }

    public void addElement(Object object) {
        if (list.length > 0 && list[0].getClass() != object.getClass()) {
            throw new ClassCastException("CustomArrayList class: " + list[0].getClass());
        }
        Object[] newList = Arrays.copyOf(list, list.length + 1);
        newList[list.length] = object;
        list = newList;
    }

    public void deleteElementByIndex(int index) {
        if (index < 0 || index > list.length) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + list.length);
        }
        Object[] newList = new Object[list.length - 1];

        // Копируем элементы до индекса
        System.arraycopy(list, 0, newList, 0, index);

        // Копируем элементы после индекса
        System.arraycopy(list, index + 1, newList, index, list.length - index - 1);
        list = newList;
    }

    public void deleteEnd() {
        deleteElementByIndex(list.length - 1);
    }

    public void shrinkOrGrow(int newLenght) {
        if (newLenght < 0) {
            throw new IllegalArgumentException("Длина не может быть отрицательной");
        }
        list = Arrays.copyOf(list, newLenght);
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
