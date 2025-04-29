package org.example.application.run;

import org.example.menuconsumer.consumer.ServiceMenuConsumer;

public class Main {
    public static void main(String[] args) {
        ServiceMenuConsumer.initializeMenu();
        ServiceMenuConsumer.showMenu();

    }
}
