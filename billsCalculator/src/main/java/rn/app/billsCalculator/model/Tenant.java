package rn.app.billsCalculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import rn.app.billsCalculator.model.enums.DocumentType;

import java.io.Serializable;

@Entity
@Table(name = "tenant")
public class Tenant{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String documentNumber;

    @Enumerated(EnumType.STRING)
    @NotBlank
    private DocumentType documentType;

    @ManyToOne
    @JoinColumn(name="rentedApartment_id",nullable = false)
    @NotBlank
    private RentedApartment rentedApartment;


    public Tenant() {
    }



}
