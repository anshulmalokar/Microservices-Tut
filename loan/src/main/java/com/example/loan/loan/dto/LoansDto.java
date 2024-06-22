package com.example.loan.loan.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class LoansDto {
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @Pattern(regexp="(^$|[0-9]{12})",message = "LoanNumber must be 12 digits")
    private String loanNumber;

    @NotEmpty(message = "LoanType can not be a null or empty")
    private String loanType;
    
    @Positive(message = "Total loan amount should be greater than zero")
    private String totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    private String amountPaid;
   
    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    private String outStandingAmount;
}