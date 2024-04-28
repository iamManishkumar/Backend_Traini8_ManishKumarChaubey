package com.traini8.trainingcenterregistry.service;

import com.traini8.trainingcenterregistry.dto.CreateTrainingCenterRequest;
import com.traini8.trainingcenterregistry.entity.TrainingCenter;

import java.util.List;

public interface TrainingCenterService {

    TrainingCenter create(CreateTrainingCenterRequest request);

    List<TrainingCenter> findAll();
}

