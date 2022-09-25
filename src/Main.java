import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //degisenleri tanimladik.
        int a;
        double daire_alan,dilim_alan,daire_cevre,pi=3.14,r;

        Scanner inp = new Scanner(System.in);
        //kullanicidan degerleri istedik.
        System.out.print("Dairenin lutfen yaricapini giriniz: ");
        r=inp.nextDouble();

        System.out.print("Daire diliminin merkez acisini giriniz: ");
        a = inp.nextInt();

        daire_alan=pi*Math.pow(r,2);
        dilim_alan=(pi*Math.pow(r,2)*a)/360;
        daire_cevre=2*pi*r;
        System.out.println("Dairenin alani: "+new DecimalFormat("##.##").format(daire_alan));
        System.out.println("Dairenin cevresi: "+new DecimalFormat("##.##").format(daire_cevre));
        System.out.println("Dairenin diliminin alani: "+new DecimalFormat("##.##").format(dilim_alan));
    }
}
