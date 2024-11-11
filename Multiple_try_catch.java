public class Multiple_try_catch {
    public static void main(String[] args){
        try{
            int a = 20/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            int b[] = {10,20,30,40,50};
            System.out.println(b[6]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
