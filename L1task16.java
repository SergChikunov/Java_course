/*
 *  Рекурсия на примере определения n-члена последовательности Фибоначчи
 */
public class L1task16 {
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            System.out.print(fibonachi(i));
            System.out.print(", ");
        }
    }

}
