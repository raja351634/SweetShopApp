package com.magizhi.sweetshop.Repo;

import com.magizhi.sweetshop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
public interface ItemRepo extends JpaRepository<Item,Long> {

    @Override
    List<Item> findAll();
}
