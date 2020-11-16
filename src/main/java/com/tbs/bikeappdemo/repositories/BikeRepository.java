package com.tbs.bikeappdemo.repositories;

import com.tbs.bikeappdemo.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike,Long> {
}
