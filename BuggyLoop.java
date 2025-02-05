public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if (i % 2 == 0) {
                System.out.println(i);
                continue;
            }
            if(i == 7){
                break;
            }
            System.out.println(i*2);
        }
    }
}