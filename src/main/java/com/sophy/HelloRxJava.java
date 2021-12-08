package com.sophy;


import io.reactivex.Observable;

public class HelloRxJava {
    public static void main(String[] args) { //psvm : live template
        Observable<String> observable = Observable.just("Hello", "RxJava");
        observable.subscribe(System.out::println);

        observable.blockingSubscribe();
    }
}
