package com.traini8.trainingcenterregistry.controlller;

import com.traini8.trainingcenterregistry.dto.CreateTrainingCenterRequest;
import com.traini8.trainingcenterregistry.dto.TrainingCenterResponse;
import com.traini8.trainingcenterregistry.entity.TrainingCenter;
import com.traini8.trainingcenterregistry.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService trainingCenterService;

    // API to create and save a new training center
    @PostMapping("/training-centers")
    public ResponseEntity<TrainingCenterResponse> createTrainingCenter(@RequestBody CreateTrainingCenterRequest request) {
        TrainingCenter trainingCenter = trainingCenterService.create(request);
        return ResponseEntity.ok(new TrainingCenterResponse(trainingCenter));
    }

    // API to get training center details
    @GetMapping("/training-centers")
    public ResponseEntity<List<TrainingCenterResponse>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = trainingCenterService.findAll();
        return ResponseEntity.ok(trainingCenters.stream().map(TrainingCenterResponse::new).collect(Collectors.toList()));
    }

}
