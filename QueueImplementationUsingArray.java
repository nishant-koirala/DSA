import java.util.Scanner;

public class QueueImplementationUsingArray {
    private int front;
    private int rear;
    private int maxsize = 5;
    private int[] queue;
    private int size = 0;

    public QueueImplementationUsingArray() {
        rear = -1;
        front = 0;
        queue = new int[maxsize];
    }

    public void inqueue(int data) {
        if (rear == maxsize - 1) {
            System.out.println("Queue is full");
        } else {
             
            rear++;
            size++;
            queue[rear] = data;
            System.out.println(data + " added in queue");
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot Delete");
        } else {
            System.out.println("The deleted element is " + queue[front]);
            front++; 
            size--;
        }
    }
    public void display() {
        if (front == rear + 1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Elements are:");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[front + i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueImplementationUsingArray q = new QueueImplementationUsingArray();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter a choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                   System.out.print("Enter element to be pushed: ");
                    q.inqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Request");
                    break;
            }
            sc.close();
        }
    }
}
