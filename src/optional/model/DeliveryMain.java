package optional.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Delivery가 없거나, 배송이 취소된 경우 배송X
public class DeliveryMain {

    static Map<Long, Order> orderRepository = new HashMap<>();
    static {
        orderRepository.put(1L, new Order(1L, new Delivery("배송완료", false)));
        orderRepository.put(2L, new Order(1L, new Delivery("배송중", false)));
        orderRepository.put(3L, new Order(1L, new Delivery("배송중", true)));
        orderRepository.put(4L, new Order(1L, null));
    }

    public static void main(String[] args) {
        System.out.println("1 = " + getDeliveryStatus(1L));
        System.out.println("2 = " + getDeliveryStatus(2L));
        System.out.println("3 = " + getDeliveryStatus(3L));
        System.out.println("4 = " + getDeliveryStatus(4L));
    }

    static String getDeliveryStatus(Long orderId) {
        return findOrder(orderId)
                .map(Order::getDelivery)
                .filter(d -> !d.isCanceled())
                .map(Delivery::getStatus)
                .orElse("배송X");

    }

    static Optional<Order> findOrder(Long orderId) {
        return Optional.ofNullable(orderRepository.get(orderId));
    }
}
