package com.begginer.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestThis {
    public static void main(String[] args) {
        NumberTest nb=(n,d)->n.concat(" ").concat(d);
        System.out.println(nb.concatinate("Atturu","Venkat"));
        IntTest at=(s)->(s%2);
        System.out.println(at.sortArrays(10));

        NumericFunc nf=(n)->{
           ArrayList<Integer>al=new ArrayList<>();
           ArrayList<Integer>al2= new ArrayList<>();
            for(int i=0;i<n;i++){
               al.add(i);
               al.add(i);
            }
            return (ArrayList<Integer>) al.stream().distinct().collect(Collectors.toList());
        };

        System.out.println(nf.func(10));

        IntTest it=(n)->{
            int result=1;
            for(int i = 1; i<=n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(it.sortArrays(5));

        StringTest st=(n)->{
            String str="";
            for(int i=n.length()-1;i>=0;i--){
             str+=n.charAt(i);
            }
            return str;
        };

        System.out.println("The reverse String is" +st.func("ABCDEF"));

    }


}
