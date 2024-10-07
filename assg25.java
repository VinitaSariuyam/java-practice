public class assg25 {

    
        private int maxSize;
        private int[] stackArray;
        private int top;
    
        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }
    
        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push " + value);
            } else {
                stackArray[++top] = value;
                System.out.println("Pushed " + value);
            }
        }
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop");
                return -1;
            } else {
                return stackArray[top--];
            }
        }
    
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek");
                return -1;
            } else {
                return stackArray[top];
            }
        }
    
        public boolean isFull() {
            return (top == maxSize - 1);
        }
    
        public boolean isEmpty() {
    
    
}
}