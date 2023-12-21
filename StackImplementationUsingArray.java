import java.util.Scanner;
public class StackImplementationUsingArray{
    private int top;
    private int max=10;
    private int []arr;
    
    public StackImplementationUsingArray(){
        top=-1;
        arr = new int[max];
    }

    public void push(int data){

        if(top==max-1){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            arr[top]=data;
            System.out.println(data+"Added in stack");
        }

    }
    public void pop(){

        if(top==-1){
            System.out.println("Stack is Empty");
          }
          else{
            System.out.println(arr[top]+"Deletated from stack");
            top--;
          }

    }

    public void display(){

         if(top==-1){
            System.out.println("Stack is Empty");
          }else
        System.out.println("\nElements are :");
        // System.out.println(arr[0]);
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        StackImplementationUsingArray s=new StackImplementationUsingArray();
        
        while (true) {
            System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("Enter a choice:");
        int choice=sc.nextInt();
        
        switch (choice) {
            case 1:
                 System.out.print("Enter element to be pushed: ");
                s.push(sc.nextInt());
                break;
            
                case 2:
                s.pop();
                break;

                case 3:
                s.display();
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
