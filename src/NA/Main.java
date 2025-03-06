package NA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("IP를 입력하세요: ");
        String[] ip = sc.next().split("\\.");
        
        System.out.print("서브넷 마스크를 입력하세요: ");
        String[] sm = sc.next().split("\\.");
        
        System.out.print("네트워크 주소: ");
        for (int i = 0; i < 4; i++) {
            System.out.print((Integer.parseInt(ip[i]) & Integer.parseInt(sm[i])) + (i < 3 ? "." : "\n"));
        }
        
        sc.close();
    }
}