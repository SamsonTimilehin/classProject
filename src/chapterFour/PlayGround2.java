package chapterFour;

public class PlayGround2 {

    static class A {
        int i = 7;
        public A() {
            setI(20);
            System.out.println("i from A is " + i);
        }
        public void setI(int i) {
            this.i = 2 * i;
        }
        public int getI(){
            return i;
        }
    }
    static class B extends A {
        private int i;
        public B() {
            setI(10);
            System.out.println("i from B is " + i);
        }
        public void setI(int i) {
            this.i = 3 * i;
        }
        public int getI(){
            return i;
        }
    }

    public static void main(String[] args) {
        A test = new A();
        System.out.println(test.getI());
        B test2 = new B();
        System.out.println(test2.getI());

    }
}