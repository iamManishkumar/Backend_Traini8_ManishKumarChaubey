package com.traini8.trainingcenterregistry.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

// Data transfer object for Create Training Center API request
@Data
public class CreateTrainingCenterRequest {

    @NotBlank(message = "Center name is mandatory and cannot be blank")
    @Size(max = 40, message = "Center name cannot exceed 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is mandatory and cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be 12 characters alphanumeric")
    private String centerCode;

    @NotBlank(message = "Detailed address is mandatory")
    private String detailedAddress;

    private String city;
    private String state;
    private String pincode;

    private int studentCapacity;

    @NotEmpty(message = "Courses offered cannot be empty")
    private List<String> coursesOffered;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "Contact phone number is mandatory and cannot be blank")
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[\\s.-]?[0-9]{3}[\\s.-]?[0-9]{4}$", message = "Invalid phone number format")
    private String contactPhone;
}
