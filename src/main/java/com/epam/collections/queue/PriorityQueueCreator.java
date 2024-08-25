package com.epam.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements from both lists to the PriorityQueue
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);

        return priorityQueue;
    }
}
