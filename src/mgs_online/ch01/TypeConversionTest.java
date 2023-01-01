package mgs_online.ch01;

public class TypeConversionTest {
    public static void main(String[] args) {

        int iNum = 255;
        byte bNum = (byte) iNum;

        System.out.println(bNum);

        double dNum = 3.14;
        iNum = (int) dNum;

        System.out.println(iNum);

        dNum = 1.2;
        float fNum = 0.9F;

        iNum = (int) dNum + (int) fNum;
        int iNum2 = (int) (dNum + fNum);

        System.out.println(iNum);
        System.out.println(iNum2);
    }
}
