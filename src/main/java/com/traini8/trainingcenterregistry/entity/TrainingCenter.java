package com.traini8.trainingcenterregistry.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.List;

// Entity class for Training Center

@Entity
@Data
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name is mandatory and cannot be blank")
    @Size(max = 40, message = "Center name cannot exceed 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is mandatory and cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be 12 characters alphanumeric")
    private String centerCode;

    @Embedded
    private Address address;

    private int studentCapacity;

    @NotEmpty(message = "Courses offered cannot be empty")
    private List<String> coursesOffered;

    @CreatedDate
    private long createdOn;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @NotBlank(message = "Contact phone number is mandatory and cannot be blank")
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[\\s.-]?[0-9]{3}[\\s.-]?[0-9]{4}$", message = "Invalid phone number format")
    private String contactPhone;

}

