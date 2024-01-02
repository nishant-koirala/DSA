import java.util.Scanner;

public class CircularQueueImplementationUsingArray{
    private static final int MAXSIZE = 5;
    private int front;
    private int rear;
    private int[] cqueue;

    public CircularQueueImplementationUsingArray() {
        front = rear = MAXSIZE - 1;
        cqueue = new int[MAXSIZE];
    }

    public void enqueue(int item) {
        if (front == (rear + 1) % MAXSIZE) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % MAXSIZE;
            cqueue[rear] = item;
            System.out.println(item + " added to the queue");
        }
    }

    public void dequeue() {
        if (rear == front) {
            System.out.println("Queue is empty");
        } else {
            front = (front + 1) % MAXSIZE;
            int item = cqueue[front];
            System.out.println("Item being deleated " + item);
        }
    }

    public void display() {
        if (rear == front) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Elements are: ");
            for (int i = (front + 1) % MAXSIZE; i != (rear + 1) % MAXSIZE; i = (i + 1) % MAXSIZE) {
                System.out.print(cqueue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueueImplementationUsingArray circularQueue = new CircularQueueImplementationUsingArray();

        while (true) {
            System.out.println("1. Add to queue");
            System.out.println("2. Delete from queue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to be added: ");
                    int item = sc.nextInt();
                    circularQueue.enqueue(item);
                    break;
                case 2:
                    circularQueue.dequeue();
                    break;
                case 3:
                    circularQueue.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
