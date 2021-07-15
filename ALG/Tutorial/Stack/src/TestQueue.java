public class TestQueue {



    public static void main(String args[])

    {



        Queue queueObj = new Queue(8);



        if(queueObj.isEmpty())

        {

            System.out.println("Queue is Empty");

        }

        else

        {

            System.out.println("Queue is NOT Empty");

        }



        queueObj.enqueue(62);

        queueObj.enqueue(89);

        queueObj.enqueue(32);

        queueObj.enqueue(67);

        queueObj.enqueue(21);

        queueObj.enqueue(39);

        queueObj.enqueue(88);

        queueObj.enqueue(55);



        queueObj.enqueue(94);



        System.out.println("Value Deleted is " + queueObj.dequeue());

        System.out.println("Value Deleted is " + queueObj.dequeue());

        System.out.println("Value Deleted is " + queueObj.dequeue());



        queueObj.enqueue(89);



        if(queueObj.isFull())

        {

            System.out.println("Queue is Full");

        }

        else

        {

            System.out.println("Queue is NOT Full");

        }



    }



}
