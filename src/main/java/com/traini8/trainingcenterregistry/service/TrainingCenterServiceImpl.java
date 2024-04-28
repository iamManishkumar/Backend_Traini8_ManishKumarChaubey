package com.traini8.trainingcenterregistry.service;

import com.traini8.trainingcenterregistry.dto.CreateTrainingCenterRequest;
import com.traini8.trainingcenterregistry.entity.Address;
import com.traini8.trainingcenterregistry.entity.TrainingCenter;
import com.traini8.trainingcenterregistry.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    @Override
    public TrainingCenter create(CreateTrainingCenterRequest request) {
        TrainingCenter trainingCenter = new TrainingCenter();
        trainingCenter.setCenterName(request.getCenterName());
        trainingCenter.setCenterCode(request.getCenterCode());

        Address address = new Address();
        address.setDetailedAddress(request.getDetailedAddress());
        address.setCity(request.getCity());
        address.setState(request.getState());
        address.setPincode(request.getPincode());
        trainingCenter.setAddress(address);

        trainingCenter.setStudentCapacity(request.getStudentCapacity());
        trainingCenter.setCoursesOffered(request.getCoursesOffered());
        trainingCenter.setCreatedOn(System.currentTimeMillis()); // Set current timestamp
        trainingCenter.setContactEmail(request.getContactEmail());
        trainingCenter.setContactPhone(request.getContactPhone());

        return trainingCenterRepository.save(trainingCenter);
    }

    // Retrieves all training centers from the database.
    @Override
    public List<TrainingCenter> findAll() {
        return trainingCenterRepository.findAll();
    }
}

