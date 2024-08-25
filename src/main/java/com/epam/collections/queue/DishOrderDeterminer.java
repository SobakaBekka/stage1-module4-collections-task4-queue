package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // Initialize the queue with dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        // Simulate eating the dishes
        while (!queue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                queue.add(queue.poll()); // Rotate the queue until the next dish to eat
            }
            result.add(queue.poll()); // Eat the dish
        }

        return result;
    }
}
