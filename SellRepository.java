package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.Sell;

public interface SellRepository extends JpaRepository<Sell, Integer> {

}
