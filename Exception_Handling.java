public class Exception_Handling {
    public static void main(String[] args){
        // if there is an error in try block then 
        // it will not excute 
        try{
            int a = 5;
            int b = 0;
            int div = a/b;
            System.out.println(div);
        }
        //  catch block will excute instead of try :
        
        catch(Exception e){

            System.out.println("not excute :" +e);
        }

        // but what will happen if their error iin both block of 
        // code try and catch
        // then here finally concept came

        try{
            int a = 5;
            int b = 0;
            int div = a/b;
            System.out.println(div);
        }
        catch(Exception e){
            int d =5;
            int r = 0;
            int div = d/r;
            System.out.println(div);
        }
        // here finally block of code will excute at any cost
        //  why there is error in finally block of code
        finally{
            System.out.println("there is an error in try and catch block");
        }
    }
}
