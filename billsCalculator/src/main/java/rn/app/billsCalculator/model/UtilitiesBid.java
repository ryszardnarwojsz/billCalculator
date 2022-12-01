package rn.app.billsCalculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import rn.app.billsCalculator.model.enums.DetailUtilityName;
import rn.app.billsCalculator.model.enums.MeterUnitType;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "utilitiesBid")
public class UtilitiesBid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private BigDecimal currentRate;
    @NotBlank
    private LocalDate rateDateUpdate;

    @ManyToOne
    @JoinColumn(name = "general_utility_id",nullable = false)
    @NotBlank
    private GeneralUtility generalUtility;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private MeterUnitType meterUnitType;

    @ManyToOne
    @JoinColumn(name = "rented_apartment_id",nullable = false)
    @NotBlank
    private RentedApartment rentedApartment;


    public UtilitiesBid() {
    }


}
