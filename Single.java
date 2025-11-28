class Base // 8
{
    public int i, j;

    public void fun() {
        System.out.println("Inside Base Fun");
    }

}

class Derived extends Base // 12
{
    public int x;

    public void gun() {
        System.out.println("Inside Derived Gun");
    }
}

class Single {
    public static void main(String[] args) {
        Base bobj = new Base();
        Derived dobj = new Derived();

        bobj.fun();

        dobj.fun();
        dobj.gun();
    }
}