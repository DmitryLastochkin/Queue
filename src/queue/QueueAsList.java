package queue;

import java.util.NoSuchElementException;

/**
 *
 * @author 2D
 */
public class QueueAsList<Type> {

    private class ListItem {

        Type data;
        ListItem next;
    }
    private int N;
    private ListItem begin;
    private ListItem end;

    public QueueAsList() {
        begin = null;
        end = null;
        N = 0;
    }

    public boolean IsEmpty() {
        return begin == null;
    }

    public Type TakeHead() {
        if (!IsEmpty()) {
            return begin.data;
        } else {
            return null;
        }
    }

    public int Size() {
        return N;
    }

    public void Push(Type data) {
        ListItem oldEnd = end;
        end = new ListItem();
        end.data = data;
        end.next = null;
        if (IsEmpty()) {
            begin = end;
        } else {
            oldEnd.next = end;
        }
        N++;
    }

    public Type Pop() {
        if (IsEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Type data = begin.data;
        begin = begin.next;
        N--;
        if (IsEmpty()) {
            end = null;
        }
        return data;
    }
}
