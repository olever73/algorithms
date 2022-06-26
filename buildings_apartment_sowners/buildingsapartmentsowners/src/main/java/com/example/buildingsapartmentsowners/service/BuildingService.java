package com.example.buildingsapartmentsowners.service;



import com.example.buildingsapartmentsowners.dto.ApartmentResponseDTO;
import com.example.buildingsapartmentsowners.dto.BuildingRequestDTO;
import com.example.buildingsapartmentsowners.dto.BuildingResponseDTO;

import java.util.List;


public interface BuildingService {

    // POST Mapping @RequestBody
    void create(BuildingRequestDTO buildingDTO, int apartmentsCount);
    List<BuildingResponseDTO> getBuildingsByStreet(String street);

    List<ApartmentResponseDTO> getApartmentsWithOwnersById(Long buildingId);

    List<ApartmentResponseDTO> getApartmentsByBuildingId(Long buildingId);

    void moveAnOwner(Long buildingId, Long apartmentId, Long ownerId);

    void evictOwnerFromApartment(Long buildingId, Long apartmentId, Long ownerId);

}