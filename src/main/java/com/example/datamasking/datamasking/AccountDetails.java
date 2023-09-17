package com.example.datamasking.datamasking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDetails {

    private String accountHolderName;
    @MaskData
    private String accountNumber;
    private String accountType;
}
