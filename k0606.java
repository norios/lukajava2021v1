public class k0606 {
    public static void main(String[] args) {
        int A = 13;
        int B = 5;
        int M = 24;
        int X = 8;
        int N = 10;
        
        for (int i = 0;i<=N;i++){            
            System.out.println("X" + i + " = " + X);
            X = (A*X+B)%M;
        }

    }
}