package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> resultList = new ArrayList<>();
            for (Integer element : list){
                resultList.add(element/divider);
            }
            return resultList;
        };
    }
}
