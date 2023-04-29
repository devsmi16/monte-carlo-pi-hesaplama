import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        int n = 1000000; // simülasyon için atılan nokta sayısı
        int k = 0;

        Random random = new Random();

        for (int i = 0; i < n; i++){    //rasgele bir nokta seç
            double x = random.nextDouble();
            double y = random.nextDouble();
            // noktanın içinde olup olmadığını kontrol et

            if (x * x + y * y <= 1){
                k++;
            }
        }
        // pi sayısını hesapla

        double pi = 4.0 * k / n;

        System.out.println("result: " + pi);
    }
}
