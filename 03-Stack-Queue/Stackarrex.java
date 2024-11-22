import java.util.Scanner;

class StackArr
{
    int top =-1;
    int[] arr;

    public StackArr(int n)
    {
        arr = new int[n];
    }

    public void push(int val)
    {
        if(top == arr.length-1)
        {
            System.out.println("Stack Full");
        }
        else
        {
            top++;
            arr[top]=val;
            System.out.println("Pushed "+val+" onto the Stack");
        }
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Popped "+arr[top]+" from the Stack");
            top--;
        }
    }

    public void display()
    {
        System.out.print("Stack elements:");            
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public void size()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        System.out.println("The Size of the Stack is "+(top+1));
    }

    public void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("The Top of the Stack is "+arr[top]);
        }
    }
}

public class Stackarrex {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Size of the Stack:");
        int n = inp.nextInt();
        StackArr st = new StackArr(n);
        inp.close();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.size();
        st.peek();
        st.pop();
        st.peek();
        
    }
}
