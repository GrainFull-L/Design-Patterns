package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer:observers){
            observer.response();
        }
    }

    public static void main(String[] args) {

        Observer one = new ConcreteObserverOne();
        Observer two = new ConcreteObserverTwo();

        Subject subject = new Subject();
        subject.add(one);
        subject.add(two);
        subject.notifyObservers();

    }

}
