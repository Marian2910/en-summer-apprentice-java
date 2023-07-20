//package com.Endava.EventTix.Controller;
//
//import com.Endava.EventTix.Model.Orders;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.HashMap;
//
//public class OrdersController {
//    // Inject the OrderService
//    private final OrdersService ordersService;
//
//    @Autowired
//    public OrderController(OrdersService ordersService) {
//        this.ordersService = ordersService;
//    }
//
//    @GetMapping
//    public List<Orders> getOrders() {
//        // For simplicity, hardcode the customerId here
//        int customerId = 123; // Hardcoded customerId (as mentioned in the text)
//
//        return ordersService.getOrdersByCustomerId(customerId);
//    }
//
//    @PostMapping
//    public ResponseEntity<Map<String, Orders>> createOrder(@RequestBody OrdersRequest ordersRequest) {
//        // For simplicity, hardcode the customerId here
//        int customerId = 123; // Hardcoded customerId (as mentioned in the text)
//
//        Orders orders = orderService.createOrder(customerId, orderRequest.getEventId(),
//                orderRequest.getTicketCategoryId(), orderRequest.getNumberOfTickets());
//
//        Map<String, Orders> response = new HashMap<>();
//        response.put("order", order);
//
//        return ResponseEntity.ok(response);
//    }
//}
