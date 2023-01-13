package mgs_lecture.homework.Ch12Homework김형준1;

public class ExceptionTest {

    public static void main(String[] args) {

        try {

            int score = -123;
            validateScore(score);

        } catch (ScoreOutOfBoundException se) {

            se.printStackTrace();
            System.out.println(se.getMessage());

        } finally {

            System.out.println("Hello try~catch~finally!");

        }
    }

    public static void validateScore(int score) throws ScoreOutOfBoundException{
        
        if (score < 0 || score > 100) {
            String message = "Exception message : 입력한 점수(" + score + ")의 범위가 올바르지 않습니다.";
            throw new ScoreOutOfBoundException(message);
        }

        System.out.println("점수는 " + score + "점 입니다.");
        
    }
}