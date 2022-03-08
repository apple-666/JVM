package work;

/**
 * @Author Double_apple
 * @Date 2022/3/5 16:51
 * @Version 1.0
 */
public class Appletes {
    public static void main(String[] args) {
        Short i = 10;
//        i=i*5;
        System.out.println(i);
        synchronized (i){
            System.out.println();
        }
    }
}
