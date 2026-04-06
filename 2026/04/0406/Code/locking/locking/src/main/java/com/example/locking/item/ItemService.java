package com.example.locking.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void updateItemQuantity(Long itemId, Integer newQuantity) {
        // 비관적 락을 사용하여 데이터를 조회합니다.
        Item item = itemRepository.findByIdWithLock(itemId);

        // 재고 수량을 수정합니다.
        item.setQuantity(newQuantity);

        // 수정된 데이터를 저장합니다.
        itemRepository.save(item);
    }

    @Transactional
    public Item findItemById(Long itemId) {
        // 비관적 락 없이 데이터를 조회합니다.
        return itemRepository.findById(itemId).orElse(null);
    }
}