public class ThrowableExample {
    public static void main(String[] args){
        try{
            throw new Exception("this is a custom Exception");
        }catch(Throwable t){
            System.out.println("Caught throwable"+t.getClass().getName());
            System.out.println(t);
        }

        try{
            throw new Error("This is custom error:");
        }catch(Throwable t){
            System.out.println("Caught Throwable"+t.getClass().getName());
            System.out.println(t.getMessage());
        }
    }
}
