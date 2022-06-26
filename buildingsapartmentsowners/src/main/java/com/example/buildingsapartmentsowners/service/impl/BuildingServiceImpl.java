package com.example.buildingsapartmentsowners.service.impl;


import com.example.buildingsapartmentsowners.dto.ApartmentResponseDTO;
import com.example.buildingsapartmentsowners.dto.BuildingRequestDTO;
import com.example.buildingsapartmentsowners.dto.BuildingResponseDTO;
import com.example.buildingsapartmentsowners.entity.Apartment;
import com.example.buildingsapartmentsowners.entity.Building;
import com.example.buildingsapartmentsowners.repository.ApartmentRepository;
import com.example.buildingsapartmentsowners.repository.BuildingRepository;
import com.example.buildingsapartmentsowners.repository.OwnerRepository;
import com.example.buildingsapartmentsowners.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public void create(BuildingRequestDTO buildingDTO, int apartmentsCount) {
        if (buildingRepository.findBuildingsByStreetAndHouse(buildingDTO.getStreet(), buildingDTO.getHouse()) != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    String.format(String.format("'%s' street already exists!",
                            buildingDTO.getStreet()), "The building with number '%s' on the ", buildingDTO.getHouse()));
        }
        buildingRepository.save(
                Building.builder()
                        .street(buildingDTO.getStreet())
                        .house(buildingDTO.getHouse())
                        .build());
        Building building = buildingRepository.findBuildingsByStreetAndHouse(buildingDTO.getStreet(), buildingDTO.getHouse());
        for (int i = 0; i < apartmentsCount; i++) {
            apartmentRepository.save(Apartment.builder().building(building).build());
        }
    }

    @Override
    public List<BuildingResponseDTO> getBuildingsByStreet(String street) {

        return buildingRepository.findBuildingsByStreet(street)
                .stream()
                .map(this::convertBuildingToDto)
                .collect(Collectors.toList());
    }

    //////////////////////////
    @Override
    public List<ApartmentResponseDTO> getApartmentsWithOwnersById(Long buildingId) {

        return null;
    }

    @Override
    public List<ApartmentResponseDTO> getApartmentsByBuildingId(Long buildingId) {
        /*
        Building building = findBuildingById(buildingId); // для респонса not found

        return apartmentRepository.findApartmentsByBuilding(building)
                .stream()
                .map(this::convertApartmentToDto)
                .collect(Collectors.toList());

         */
        return null;
    }

    @Override
    public void moveAnOwner(Long buildingId, Long apartmentId, Long ownerId) {

    }

    @Override
    public void evictOwnerFromApartment(Long buildingId, Long apartmentId, Long ownerId) {

    }



    private BuildingResponseDTO convertBuildingToDto(Building building) {
        return BuildingResponseDTO.builder()
                .id(building.getId())
                .address(building.getStreet()+""+building.getHouse())
                .countApartments(apartmentRepository.countApartmentsByBuildingid((building.getId())))
                .build();
    }

    }


