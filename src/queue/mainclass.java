
package queue;

/**
 *
 * @author 2D
 */
public class mainclass {
    public static void main(String args[]){
        QueueAsList<Integer> q = new QueueAsList<Integer>();
        for (int i = 1; i < 6; i++)
            q.Push(i);
        
        Integer head = q.TakeHead();
        
        System.out.println("Head: " + head);
        System.out.println("------------");
        
        int size = q.Size();
        
        System.out.println("Size: " + size);
        System.out.println("------------");
        
        Integer data = 0;
                          
        while (size != 0){
            data = q.Pop();
            System.out.print(data + " ");
            size = q.Size();
        }
        System.out.println();
    }
    
}
