package by.it._classwork_.jd02_03.model;

import by.it._classwork_.jd02_03.helper.RandomInt;
import by.it._classwork_.jd02_03.helper.Timeout;
import by.it._classwork_.jd02_03.model.Casheir;
import by.it._classwork_.jd02_03.model.Customer;
import by.it._classwork_.jd02_03.model.Manager;
import by.it._classwork_.jd02_03.model.Queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Store {

    private final Manager manager;
    private final Queue queue = new Queue();
    private final Semaphore semaphore = new Semaphore(20);
    public Store(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public Queue getQueue() {
        return queue;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }


}
