package rn.app.billsCalculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class BillLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private LocalDate calculationDate;

    @NotBlank
    private BigDecimal calculatedValue;

    @ManyToOne
    @JoinColumn(name = "utilities_bid_id",nullable = false)
    private UtilitiesBid utilitiesBid;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    @NotBlank
    private Long usageFromPreviousMeter;


}
