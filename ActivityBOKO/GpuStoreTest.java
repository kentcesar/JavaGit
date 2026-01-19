package ActivityBOKO;
import java.util.Scanner;

public class GpuStoreTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GpuStore gpu = new GpuStore();
        boolean deci = true;


        while (deci == true) {
            System.out.println("              GPU STORE                ");
            System.out.println("ID            NAME            PRICE    ");
            System.out.println("1           RTX 3070      Php 25,000.00");
            System.out.println("2           RTX 3080      Php 30,000.00");
            System.out.println("3           RTX 3090      Php 45,000.00");
            System.out.println("4                 EXIT                 ");
            System.out.print("Enter ID: ");
            gpu.setid(in.nextInt());
            gpu.checker();
            System.out.println();
            
            }
            }
            
        }


