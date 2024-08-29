package com.fight_world.mono.domain.menu.service;

import com.fight_world.mono.domain.menu.dto.response.MenuResponseDto;
import com.fight_world.mono.domain.menu.model.Menu;

public interface MenuService {

    // 메뉴 등록

    // 메뉴 상세 조회
    MenuResponseDto getMenu(String menuId);

    // 메뉴 목록 조회

    // 메뉴 정보 수정

    // 메뉴 상태 변경

    // 메뉴 삭제

    // 메뉴 조회

    // menuId로 메뉴 조회
    Menu findById(String menuId);
}
