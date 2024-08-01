package com.example.codding.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private final ItemRepository itemRepository;

    // 서버/DB 데이터를 타임 리프 쓰면 HTML 에 넣을 수 있다.
    @GetMapping("/list")
    public String itemList(Model model) {

        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "item_list";
    }


}
