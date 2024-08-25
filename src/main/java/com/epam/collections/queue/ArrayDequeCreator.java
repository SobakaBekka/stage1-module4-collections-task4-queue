package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Initial move: both players add two cards to the ArrayDeque
        deque.add(firstQueue.poll());
        deque.add(firstQueue.poll());
        deque.add(secondQueue.poll());
        deque.add(secondQueue.poll());

        // Play the game until both queues are empty
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // First player's move
            firstQueue.add(deque.pollLast());
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());

            // Second player's move
            secondQueue.add(deque.pollLast());
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }

        return deque;
    }
}
