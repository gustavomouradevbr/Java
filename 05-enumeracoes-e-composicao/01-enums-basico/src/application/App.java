package application;

import java.time.LocalDateTime;

import entities.Order;
import entitiesenums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);



    }
}

