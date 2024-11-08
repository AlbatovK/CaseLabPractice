package org.example;

public class OpenClosed {
    public static void main(String[] args) {

    }
}

class Order {
    // ... свойства заказа ...
}

interface DeliveryService {
    void deliver(Order order);
}

class CourierDeliveryService implements DeliveryService {
    @Override
    public void deliver(Order order) {
        System.out.println("Courier");
    }
}

class PostDeliveryService implements DeliveryService {
    @Override
    public void deliver(Order order) {
        System.out.println("Post");
    }
}

class DroneDeliveryService implements DeliveryService {
    @Override
    public void deliver(Order order) {
        System.out.println("Drone");
    }
}


class OrderService {

    private DeliveryService deliveryService;

    public OrderService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void deliver(Order order) {
        deliveryService.deliver(order);
    }
}

