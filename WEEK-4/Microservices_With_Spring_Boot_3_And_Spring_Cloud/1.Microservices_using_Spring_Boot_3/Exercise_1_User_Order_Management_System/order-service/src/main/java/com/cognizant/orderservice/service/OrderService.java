package com.cognizant.orderservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.cognizant.orderservice.dto.OrderResponse;
import com.cognizant.orderservice.dto.UserDTO;
import com.cognizant.orderservice.entity.Order;
import com.cognizant.orderservice.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private WebClient webClient;

    // Add Order
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get All Orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get Order By ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Update Order
    public Order updateOrder(Long id, Order order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    // Delete Order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    // Get Order with User Details
    public OrderResponse getOrderWithUser(Long orderId) {

        Order order = orderRepository.findById(orderId).orElse(null);

        if (order == null) {
            return null;
        }

        UserDTO user = webClient
                .get()
                .uri("http://localhost:8081/users/" + order.getUserId())
                .retrieve()
                .bodyToMono(UserDTO.class)
                .block();

        OrderResponse response = new OrderResponse();

        response.setOrderId(order.getId());
        response.setProductName(order.getProductName());
        response.setQuantity(order.getQuantity());
        response.setPrice(order.getPrice());
        response.setUser(user);

        return response;
    }
}