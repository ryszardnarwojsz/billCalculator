package rn.app.billsCalculator.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Bill {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate billDate;
    private BigDecimal totalValue;




}
