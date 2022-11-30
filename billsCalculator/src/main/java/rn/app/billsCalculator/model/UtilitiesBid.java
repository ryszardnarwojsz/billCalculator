package rn.app.billsCalculator.model;

import rn.app.billsCalculator.model.enums.DetailUtilityName;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UtilitiesBid {

    private DetailUtilityName detailUtilityName;
    private BigDecimal currentRate;
    private LocalDate rateDateUpdate;
}
