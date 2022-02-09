public class exceptionMain {
    public static void main(String[] args){
        try{
            int a = 10;
            System.out.println(a);
            System.out.println(a/0);
            System.out.println(a/5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception executed successfully!!");
        }
    }
}
