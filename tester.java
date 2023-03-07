import calculator.*;

public class tester {
    public static void main(String args[]){
        complex n1 = new complex(2,3);
        complex n2 = new complex(4, 7);
        basic a = new basic();
        System.out.println(a.add(4, 5));
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1.add(n2));
    }
}

