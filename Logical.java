public class Logical {
    public static void main(String[] args) {
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 > 3) && (8 < 5));
        System.out.println((5 < 3) || (8 > 5));
        System.out.println(5 > 3);
        System.out.println((5 < 3) || (8 < 5));
        System.out.println(!(5==3));
        System.out.println(!(5>3));
        int x =7;
        int z;
        int a;
        a = ~x;
        z = x<<1;
        System.out.println(z);
        System.out.println(a);
     }
    
}
