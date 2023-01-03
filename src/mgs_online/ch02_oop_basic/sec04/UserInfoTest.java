package mgs_online.ch02_oop_basic.sec04;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userlee = new UserInfo();
        userlee.userId = "a12345";
        userlee.userPassWord = "zxcvbn12345";
        userlee.userName = "Lee";
        userlee.phoneNumber = "01034556699";
        userlee.userAddress = "Seoul, Korea";

        System.out.println(userlee.showUserInfo());

        UserInfo userKim = new UserInfo("b12345", "0987mnbvc", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}
