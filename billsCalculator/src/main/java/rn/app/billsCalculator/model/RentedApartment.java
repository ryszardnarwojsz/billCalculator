package rn.app.billsCalculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "rentedApartment")
public class RentedApartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String address;
    @NotBlank
    private String city;
    @NotBlank
    private String postalCode;
    @NotBlank
    private Long area;

    public RentedApartment() {
    }



}
