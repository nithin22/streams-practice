package day1.patterns;

public class RightAngledTraingle {

    public static void main(String[] args) {
        int number=5;

        for(int i=1;i<=number;i++){
            for(int j=i;j<=number;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
