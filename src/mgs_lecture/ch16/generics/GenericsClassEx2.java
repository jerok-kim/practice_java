package mgs_lecture.ch16.generics;

public class GenericsClassEx2<T> {
    T element;
    
    void setElement(T element) {
        this.element = element;
    }
    
    T getElement() {
        return element;
    }
}
