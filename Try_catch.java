public class Try_catch {
    public static void main(String[] args){
        try{
            int a = 50/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
