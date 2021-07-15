public class TestStack {

    public static void main(String args[])

    {



        Stack stackObj = new Stack(8);



        stackObj.push(62);

        stackObj.push(89);

        stackObj.push(32);

        stackObj.push(67);

        stackObj.push(21);

        stackObj.push(39);

        stackObj.push(88);

        stackObj.push(55);



        stackObj.push(94);



        System.out.println(stackObj.pop());   // 55

        System.out.println(stackObj.pop());   // 88

        System.out.println(stackObj.pop());   // 39





        if (stackObj.isFull())

        {

            System.out.println("Stack is Full");

        }

        else

        {

            System.out.println("Stack is not full");

        }





        System.out.println(stackObj.peek());   // 21

        System.out.println(stackObj.peek());   // 21



    }

}

