import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tutar, kdv, oran;
    
        Scanner inp= new Scanner(System.in);

        System.out.println("Tutar giriniz");
        tutar=inp.nextDouble();
        oran= tutar>1000 ? 0.08:0.18;

        kdv=tutar*oran;
        tutar=tutar+kdv;
        
        System.out.println("KDV'li fiyat="+tutar);
        System.out.println("KDV tutarı="+kdv);
        
    }
}