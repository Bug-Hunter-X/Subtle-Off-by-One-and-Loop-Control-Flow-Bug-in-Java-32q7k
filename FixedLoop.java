public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
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