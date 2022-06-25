package com.example.buildingsapartmentsowners.repository;

import com.example.buildingsapartmentsowners.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  OwnerRepository extends JpaRepository<Owner, Long> {
List<Owner> findOwnersByApartamentId(Long id);
}
