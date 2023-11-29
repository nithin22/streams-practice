package com.begginer.genericlambda;

public class TestLambdaAsArgument {
    public static void main(String[] args) {
        String str="This is the String to be refactored";
        String result;

        result=LambdaAsArgumentDemo.stringOp((s)->
            s.toUpperCase(),str);
        System.out.println("Strin in Upper Case"+result);

        result=LambdaAsArgumentDemo.stringOp((s)->{
            String finalresult="";

            for(int i=0;i<s.length();i++){
                if(str.charAt(i)!=' '){
                    finalresult+=str.charAt(i);
                }
            }
            return finalresult;
        },str);

        System.out.println("String with spaces removed are "+result);

        result=LambdaAsArgumentDemo.stringOp((s)->{
            String reveredString="";

            for(int i=s.length()-1;i>=0;i--){
                reveredString+=s.charAt(i);
            }
            return reveredString;
        },str);
        System.out.println("The Reversed String is:"+result);
    }
}
