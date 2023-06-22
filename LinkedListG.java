import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> A=new LinkedList<>();
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(40);
        A.addFirst(0);
        System.out.println(A);
        A.remove(Integer.valueOf(40));
        A.remove(1);
        System.out.println(A.size());
        var brr=A.toArray();
        String s=Arrays.toString(brr);
        System.out.println(s);
        }
    }
