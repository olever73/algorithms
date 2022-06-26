package com.example.buildingsapartmentsowners.repository;


import com.example.buildingsapartmentsowners.entity.Apartment;
import com.example.buildingsapartmentsowners.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment,Long> {

    List<Apartment> findApartamentByByBuilding(Building building);

    Integer countApartmentsByBuildingid(Long id);


    Apartment findApartmendById(Long apartmentId);
}
