package rn.app.billsCalculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name = "meterReading")
public class MeterReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private Long currentMeter;
    @NotBlank
    private LocalDate meterDate;

    @ManyToOne
    @JoinColumn(name = "general_utility_id",nullable = false)
    @NotBlank
    private GeneralUtility generalUtility;

    @ManyToOne
    @JoinColumn(name = "rented_apartment_id",nullable = false)
    private RentedApartment rentedApartment;

    @ManyToOne
    @JoinColumn(name = "bill_line_id")
    private BillLine billLine;



    public MeterReading() {
    }



}
