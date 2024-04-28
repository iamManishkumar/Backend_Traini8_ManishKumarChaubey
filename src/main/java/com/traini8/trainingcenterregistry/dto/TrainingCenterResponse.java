package com.traini8.trainingcenterregistry.dto;

import com.traini8.trainingcenterregistry.entity.Address;
import com.traini8.trainingcenterregistry.entity.TrainingCenter;
import lombok.Data;

import java.util.List;

// Data transfer object for Training Center API response
@Data
public class TrainingCenterResponse {

    private Long id;
    private String centerName;
    private String centerCode;
    private Address address;
    private int studentCapacity;
    private List<String> coursesOffered;
    private long createdOn;
    private String contactEmail;
    private String contactPhone;

    public TrainingCenterResponse(TrainingCenter trainingCenter) {
        this.id = trainingCenter.getId();
        this.centerName = trainingCenter.getCenterName();
        this.centerCode = trainingCenter.getCenterCode();
        this.address = trainingCenter.getAddress();
        this.studentCapacity = trainingCenter.getStudentCapacity();
        this.coursesOffered = trainingCenter.getCoursesOffered();
        this.createdOn = trainingCenter.getCreatedOn();
        this.contactEmail = trainingCenter.getContactEmail();
        this.contactPhone = trainingCenter.getContactPhone();
    }
}

