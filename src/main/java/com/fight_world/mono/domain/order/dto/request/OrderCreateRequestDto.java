package com.fight_world.mono.domain.order.dto.request;

import com.fight_world.mono.domain.order_menu.dto.request.OrderMenuCreateRequestDto;
import java.util.List;

public record OrderCreateRequestDto(
    String store_id,
    List<OrderMenuCreateRequestDto> menu_ids,
    String delivery_type
) {

}