    public class MyDeque<E>{
      // Instance variables
      private E[] data;
      private int size;
      private int start, end;

      // Constructors
      public MyDeque(){ 
        data = (E[])new Object[ENTER_CAPACITY_HERE];
        size = 0;
        start = 0;
        end = 0;
      }
  
      public MyDeque(int initialCapacity){ 
         data = (E[])new Object[ENTER_CAPACITY_HERE];
         size = 0;
         start = 0;
         end = 0;
      }
      
      // Add a new value on the indicated side
      public void addFirst(E element){ }
      public void addLast(E element){ }
      
      // Remove and return the element
      public E removeFirst(){ }
      public E removeLast(){ }
      
      // Return the element. Do not delete elements.
      public E getFirst(){ }
      public E getLast(){ }
      
      // Return deque size
      public int size(){ }
      
      // Getters
  
      // Return data
      public E[] getData(){ }
      // Return start
      public int getStart(){ }
      // Return end
      public int getEnd(){ }
      
      // Resize the array. Double its length (data.length * 2)
      private void resize() {}
      
      // Return the deque as string in the correct order
      // Ex.:  "[hello, my, dear, friends!]" where hello is the value at start index
      // and friends! is the value at end index
      public String toString(){ }
    }
