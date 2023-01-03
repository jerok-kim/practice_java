package mgs_online.ch01_java_basic;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;
        
        int lastScore = gameScore++;
        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}
