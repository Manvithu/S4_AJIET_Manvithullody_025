class Swap {
     public static void main(String[] args) {
        int a = 7;
        int b = 9;
        int temp;
        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
