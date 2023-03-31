import java.util.Scanner;

public class Bai1 {
//    Xóa 1 phần tử trong mảng
    public static void main(String[] args) {
        int daySo[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = timViTriPhanTu(daySo,soCanXoa);
        if(viTriCanXoa == -1){
            System.out.println("Phần tử không ở trong mảng");
        }else{
                daySo = xoaPhanTu(daySo,viTriCanXoa);


            for (int i = 0; i < daySo.length;i++){
                System.out.print(daySo[i]+" ");
            }
        }


    }
    public static int timViTriPhanTu(int[] daySo,int phanTu){
        int viTri = -1 ;
        for (int i = 0 ; i < daySo.length;i++){
            if(daySo[i] == phanTu){
                viTri = i;
            }
        }
        return viTri;
    }
//    xóa 1 phần tử xong phải trả về một mảng mới
//    cơ chế xóa 1 phần tử

     public static int[] xoaPhanTu(int[] daySo, int viTri){
        int[] daySoMoi = new int[daySo.length-1];
        for (int i = 0; i < viTri; i++){
            daySoMoi[i] = daySo[i];
        }
        for (int i = viTri+1;i < daySo.length;i++){
            daySoMoi[i-1] = daySo[i];
        }
        return daySoMoi;
    }
}
