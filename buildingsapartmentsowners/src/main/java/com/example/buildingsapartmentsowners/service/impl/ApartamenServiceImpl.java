package com.example.buildingsapartmentsowners.service.impl;




import com.example.buildingsapartmentsowners.dto.ApartmentRequestDTO;
import com.example.buildingsapartmentsowners.dto.ApartmentResponseDTO;
import com.example.buildingsapartmentsowners.dto.OwnerResponseDTO;
import com.example.buildingsapartmentsowners.entity.Apartment;
import com.example.buildingsapartmentsowners.entity.Owner;
import com.example.buildingsapartmentsowners.repository.ApartmentRepository;

import com.example.buildingsapartmentsowners.repository.OwnerRepository;
import com.example.buildingsapartmentsowners.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApartamenServiceImpl implements ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private OwnerRepository ownerRepository;


    @Override
    public void edit(Long apartmentId, ApartmentRequestDTO apartmentDTO) {
                     Apartment apartment= apartmentRepository.findApartmendById(apartmentId);
                     apartment.setApartmentNumber(apartmentDTO.getApartmentNumber());
                     apartment.setHasBalcony(apartmentDTO.getHasBalcony());
                     apartmentRepository.save(apartment);
    }

    @Override
    public List<ApartmentResponseDTO> getAllApartments() {
        return null;
    }

    @Override
    public ApartmentResponseDTO getApartmentById(Long id) {
        return null;
    }



    private ApartmentResponseDTO findApartmendById (Long id){
        Apartment apartment=findApartmendById(id);
        return  convertApartmentToResponseDTO(apartment);

    }

    private ApartmentResponseDTO convertApartmentToResponseDTO(Apartment apartment) {

        return ApartmentResponseDTO
                .builder()
                .id(apartment.getId())
                .apartmentNumber(apartment.getApartmentNumber())
                .hasBalcony(apartment.getHasBalcony())
                .owners(getOwnersByApartmentId(apartment.getId()))
                .build();
    }

    private List<OwnerResponseDTO> getOwnersByApartmentId(Long id) {
        return ownerRepository.findOwnersByApartamentId(id)
                .stream()
                .map(this::convertOwnerToDTO)
                 .collect(Collectors.toList());
    }

    private OwnerResponseDTO convertOwnerToDTO(Owner owner) {
       return OwnerResponseDTO
                .builder()
                .name(owner.getName())
               .apartmentId(owner.getApartment().getId())
               .build();
    }
}


