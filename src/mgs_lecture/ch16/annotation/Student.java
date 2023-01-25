package mgs_lecture.ch16.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Student {
    String firstName();

    String lastName();

    int rollNo();
}
