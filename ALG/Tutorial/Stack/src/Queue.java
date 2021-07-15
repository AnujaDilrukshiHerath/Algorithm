public class Queue {



    private int front;

    private int rear;

    private int noOfItems;

    private int maxSize;

    private int queueArray[];



    public Queue(int size)

    {

        maxSize = size;

        front = 0;

        rear = -1;

        noOfItems = 0;

        queueArray = new int [maxSize];

    }





    public boolean isFull()

    {

        return (rear == maxSize-1);

    }



    public boolean isEmpty()

    {

        return (noOfItems == 0);

    }



    public void enqueue(int item)

    {

        if (isFull())

        {

            System.out.println("The Queue is Full");

        }

        else

        {

            queueArray[++rear] = item;

            noOfItems++;

        }

    }



    public int dequeue()

    {

        if (isEmpty())

        {

            System.out.println("The Queqe is Empty");

            return -99;

        }

        else

        {

            noOfItems--;

            return queueArray[front++];

        }

    }



}
