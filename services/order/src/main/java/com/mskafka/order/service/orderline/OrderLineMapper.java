package com.mskafka.order.service.orderline;

import com.mskafka.order.domain.Order;
import com.mskafka.order.domain.orderline.OrderLine;
import com.mskafka.order.domain.orderline.OrderLineRequest;
import com.mskafka.order.domain.orderline.OrderLineResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.orderId())
                .productId(request.productId())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}
