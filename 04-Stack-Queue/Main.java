// Sample program for Stack Implementation using Array

import java.util.Scanner;

class StackArr {
    int top = -1; // Represents the index of the top element in the stack
    int[] arr;    // Array to store stack elements

    // Constructor to initialize the stack with a given size
    public StackArr(int n) {
        arr = new int[n];
    }

    // Method to push an element onto the stack
    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = val;
            System.out.println("Pushed " + val + " onto the stack.");
        }
    }

    // Method to pop the top element from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int val = arr[top];
            top--;
            System.out.println("Popped " + val + " from the stack.");
        }
    }

    // Method to peek at the top element of the stack
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("The top of the stack is " + arr[top]);
        }
    }

    // Method to get the size of the stack
    public void size() {
        System.out.println("The size of the stack is " + (top + 1));
    }

    // Method to display all elements of the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int n = inp.nextInt(); // Reading the size of the stack

        StackArr st = new StackArr(n); // Creating a stack of size n
        st.push(10); // Push 10 onto the stack
        st.push(20);
        st.push(30);
        st.push(40);

        st.peek();    // Display the top element
        st.display(); // Display all stack elements
        st.pop();     // Remove the top element
        st.peek();
        st.size();    // Display the size of the stack
        st.display(); // Display all stack elements again

        inp.close(); // Closing the scanner
    }
}
