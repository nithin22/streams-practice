package day1;

public class Example2 {
    public  void printArrayElememtsToConsole(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public void insertingTenElementsIntoArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }
    }

    public String returoingStrinngOddthisType(String name){
        printingThisReturnINAnotherMethod(name);
        return name;
    }

    private void printingThisReturnINAnotherMethod(String name) {
        System.out.println(name);
    }


}
