package com.magizhi.sweetshop.service;

import com.magizhi.sweetshop.Repo.ItemRepo;
import com.magizhi.sweetshop.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("qa")
public class DbCatalog implements Catalog{

    @Autowired
    ItemRepo itemRepo;

    @Override
    public List<Item> getItemList() {
        return itemRepo.findAll();
    }
}
