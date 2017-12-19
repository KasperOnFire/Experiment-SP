package experiment;

import java.util.ArrayList;
import java.util.Random;

public class Experiment {

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<TestObject> list1 = new ArrayList();
        for (int i = 0; i < 100; i++) {
            TestObject t = new TestObject(r);
            list1.add(t);
        }
        System.out.println("Experiment 1: getting 1 element from a list of 100");
        long start1 = System.nanoTime();
        TestObject t1 = list1.get(50);
        long elapsedTime1 = System.nanoTime() - start1;
        System.out.println("time: " + elapsedTime1);

        ArrayList<TestObject> list2 = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            TestObject t = new TestObject(r);
            list2.add(t);
        }

        System.out.println("Experiment 2: getting 1 element from list of 1000000");
        long start2 = System.nanoTime();
        TestObject t2 = list2.get(50000);
        long elapsedTime2 = System.nanoTime() - start2;
        System.out.println("time: " + elapsedTime2);

        long diff = (elapsedTime2 - elapsedTime1);
        System.out.println("experiment 2 took " + diff + " nanoseconds longer.");

    }

}
