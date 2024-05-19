package com.shoppingapp.orderservice.dto;

import java.math.BigDecimal;

public record OrderResponse(Long id, String orderNumber, String skuCode,
                            BigDecimal price, Integer quantity) {
}
