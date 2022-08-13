package task;

public class AsalSayilar {
    public static void main(String[] args) {
        int i, j = 2;

        for (i = 2; i < 100; i++) {
            if (j % i == 0){
                if (j == i) {
                    System.out.print(j + " ");
                }
                j++;
                i = 1;
            }
        }
    }
}
