class Demo {
    public int iNo1;
    public int iN02;

    public Demo() {
        System.out.println("Inside default constructor");
    }

    public Demo(int i, int j) {
        System.out.println("Inside parametrised constructor");
    }
}

class Constructor {
    public static void main(String arr[]) {

        {
            Demo dobj1 = new Demo();

            Demo dobj2 = new Demo(11, 21);

        }
    }
}