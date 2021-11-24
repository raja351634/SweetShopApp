package com.magizhi.sweetshop.service;

import com.magizhi.sweetshop.model.Item;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
@Profile("dev")
public class InMemoryCatalog implements Catalog {

    private static List<Item> itemList = new CopyOnWriteArrayList<>();
    static {
        Item item1 = new Item("Cake", BigDecimal.valueOf(3.99d));
        Item item2 = new Item("Crossient", BigDecimal.valueOf(1.99d));
        Item item3 = new Item("LemonCake", BigDecimal.valueOf(4.99d));
        Item item4 = new Item("Brownie", BigDecimal.valueOf(6.99d));
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
    }
    @Override
    public List<Item> getItemList() {
        return itemList;
    }
}
