import java.util.* ;
import java.io.*; 
public class Deque 
{
    int[] list;
    int front;
    int rear;
    int size;
    public Deque(int n) 
    {
        size = n;
        list = new int[size];
        front = -1;
        rear = -1;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        if(isFull())
            return false;
        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(front == 0)
            front = size-1;
        else
            front--;
        list[front] = x;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(isFull())
            return false;
        if(rear == -1){
            front = 0;
            rear = 0;
        }
        else if(rear == size-1)
            rear = 0;
        else
            rear++;
        list[rear] = x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(isEmpty())
            return -1;
        int temp = list[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(front == size-1)
            front = 0;
        else
            front++;
        return temp;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty())
            return -1;
        int temp = list[rear];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(rear == 0)
            rear = size-1;
        else
            rear--;
        return temp;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(isEmpty())
            return -1;
        return list[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        if(isEmpty())
            return -1;
        return list[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        if(front == -1)
            return true;
        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if((front == 0 && rear == size-1) || front == rear+1)
            return true;
        return false;
    }
}

