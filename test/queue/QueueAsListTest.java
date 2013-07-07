/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2D
 */
public class QueueAsListTest {

    public QueueAsListTest() {
    }

    @Test
    public void testIsEmpty() {
        QueueAsList q = new QueueAsList();
        assertTrue(q.IsEmpty());
    }

    @Test
    public void testPush() {
        QueueAsList<Integer> q = new QueueAsList<Integer>();
        q.Push(1);
        assertTrue(!q.IsEmpty());
    }

    @Test
    public void testSize() {
        QueueAsList<Integer> q = new QueueAsList<Integer>();
        for (int i = 1; i <= 3; i++) {
            q.Push(i);
        }
        assertTrue(q.Size() == 3);
    }

    @Test
    public void testPop() {
        QueueAsList<Integer> q = new QueueAsList<Integer>();
        q.Push(1);
        int data = q.Pop();
        assertTrue(data == 1);
    }

    @Test
    public void testTakeHead() {
        QueueAsList<Integer> q = new QueueAsList<Integer>();
        for (int i = 1; i <= 3; i++) {
            q.Push(i);
        }
        assertTrue(q.TakeHead() == 1);
    }

    @Test
    public void correctPushPop() {
        QueueAsList<Integer> q = new QueueAsList<Integer>();
        for (int i = 1; i <= 5; i++) {
            q.Push(i);
        }
        boolean flag = true;
        for (int i = 1; i <= 5; i++){
            if (q.Pop() != i){
                flag = false;
            }
        }
        assertTrue(flag);
    }
}