
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Stack<String> arr=new Stack<>();
        String s="abcdef";
        if(s==null)
       throw new IllegalArgumentException();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch =s.charAt(i);
            String alph=Character.toString(ch);
            arr.push(alph);
        }
        /*String rev="";
        while(!(arr.isEmpty()))
        {
        rev=rev+arr.pop();
        }
        System.out.println(rev);
        */
        StringBuffer rev=new StringBuffer();
        while(!(arr.isEmpty()))
        {
            rev.append(arr.pop());
        }
        System.out.println(rev.toString());
    }

}
