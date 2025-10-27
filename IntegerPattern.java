package patterns;

public class IntegerPattern {
    public static void main(String[] args) {
        int num=1;

        for(int line=1;line<=10;line++){
            for(int nums=1;nums<=line;nums++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
