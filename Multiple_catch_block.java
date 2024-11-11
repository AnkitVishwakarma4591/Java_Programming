public class Multiple_catch_block {
    public static void main(String[] args){
        try{
            int a = 50/2;   //Statements 1
            // int a = 50/0;   //Statements 1
            System.out.println(a);

            int arr[] = {10,20,30,40};  //Statements 2
            System.out.println(arr[3]);
            // System.out.println(arr[5]);

            String s = null;  //Statements 3
            System.out.println(s.toUpperCase());
        }
        catch(ArithmeticException a){
            // if first statements contain error then this will execute
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException ar){
            // if second statements contain error then this will execute
            System.out.println(ar);
        }
        catch(Exception e){
            // if we don't know that which statements is containing error then this will execute
            System.out.println(e);
        }
    }
}
