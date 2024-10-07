import java.util.Queue;

public class assg26 {


   
    private int front;
    private int rear;
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + value);
        } else {
            if (rear == maxSize - 1) {
                rear = -1;  // Wrap around
            }
            queueArray[++rear] = value;
            nItems++;
            System.out.println("Inserted " + value);
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove");
            return -1;
        } else {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;  // Wrap around
            }
            nItems--;
            return temp;
        }
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        System.out.println("Peek: " + queue.peekFront());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek: " + queue.peekFront());
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
    }
}

    

