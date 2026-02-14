public class Program{
    public static void main(String[] args){
        int res = 0;
        for (String arg: args){
            res += Integer.parseInt(arg);
        }
        System.out.println(res);
    }
}
