package com.guzova;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private List<List<Long>> triangle = new ArrayList<>();

    Triangle(int size) {
        triangle.add(new ArrayList<>());//добавляем на второй уровень вложености список
        triangle.get(0).add(1l);
        for (int i = 1; i < size; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1l);
            for (int j = 1; j < triangle.get(i - 1).size(); j++) {
                triangle.get(i).add(triangle.get(i - 1).get(j) +
                        triangle.get(i - 1).get(j - 1));
            }
            triangle.get(i).add(1l);
        }
    }
    List<List<Long>> get(){
        return triangle;
    }
}
