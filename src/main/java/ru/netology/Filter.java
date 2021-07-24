package ru.netology;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Khristiuk
 */
public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for (Integer numb : source) {
            if (numb < treshold) {
                logger.log(String.format("Элемент \"%s\" не проходит", numb));
            }
            if (numb >= treshold) {
                logger.log(String.format("Элемент \"%s\" проходит", numb));
                result.add(numb);
                count++;
            }
        }
        logger.log(String.format("Прошло фильтр %s элемента из %s", count, source.size()));
        return result;
    }
}
