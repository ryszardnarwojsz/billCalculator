package rn.app.billsCalculator.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import rn.app.billsCalculator.model.enums.DetailUtilityName;
import rn.app.billsCalculator.model.enums.GeneralUtilityType;
import rn.app.billsCalculator.model.enums.MeterFrequency;

import java.util.List;

@Entity
@Table(name = "generalUtility")
public class GeneralUtility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotBlank
    private DetailUtilityName detailUtilityName;

    @Enumerated(EnumType.STRING)
    @NotBlank
    private GeneralUtilityType generalUtilityType;

    @Enumerated(EnumType.STRING)
    @NotBlank
    private MeterFrequency meterType;


    public GeneralUtility() {
    }

}
