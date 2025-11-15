package com.example.utilities.FundData;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;



public class _1GeneralData {
    private final String fundCode;
    private final String fundType;
    private final String fundStructure;
    private final String fundCurrency;
    private final String fundNameEn;
    private final String fundNameAr;
    private final String inceptionDate;
    private final String endDate;
    private final List<String> fundManagers;
    private final List<String> fundBrokers;
    private final String fundCategory;
    private final String initialCapital;
    private final String aggregateCapital;
    private final String initialNavPerUnit;
    private final String initialUnits;
    private final List<String> custodians;
    private final List<String> auditors;
    @JsonCreator
    public _1GeneralData(@JsonProperty("fundCode") String fundCode,
                       @JsonProperty("fundType") String fundType,
                       @JsonProperty("fundStructure") String fundStructure,
                       @JsonProperty("fundCurrency") String fundCurrency,
                       @JsonProperty("fundNameEn") String fundNameEn,
                       @JsonProperty("fundNameAr") String fundNameAr,
                       @JsonProperty("inceptionDate") String inceptionDate,
                       @JsonProperty("endDate") String endDate,
                       @JsonProperty("fundManagers") List<String> fundManagers,
                       @JsonProperty("fundBrokers") List<String> fundBrokers,
                       @JsonProperty("fundCategory") String fundCategory,
                       @JsonProperty("initialCapital") String initialCapital,
                       @JsonProperty("aggregateCapital") String aggregateCapital,
                       @JsonProperty("initialNavPerUnit") String initialNavPerUnit,
                       @JsonProperty("initialUnits") String initialUnits,
                       @JsonProperty("custodians") List<String> custodians,
                       @JsonProperty("auditors") List<String> auditors) {
        this.fundCode = fundCode;
        this.fundType = fundType;
        this.fundStructure = fundStructure;
        this.fundCurrency = fundCurrency;
        this.fundNameEn = fundNameEn;
        this.fundNameAr = fundNameAr;
        this.inceptionDate = inceptionDate;
        this.endDate = endDate;
        this.fundManagers = fundManagers;
        this.fundBrokers = fundBrokers;
        this.fundCategory = fundCategory;
        this.initialCapital = initialCapital;
        this.aggregateCapital = aggregateCapital;
        this.initialNavPerUnit = initialNavPerUnit;
        this.initialUnits = initialUnits;
        this.custodians = custodians;
        this.auditors = auditors;
    }
    public String getFundCode() {
        return fundCode;
    }
    public String getFundType() {
        return fundType;
    }
    public String getFundStructure() {
        return fundStructure;
    }
    public String getFundCurrency() {
        return fundCurrency;
    }
    public String getFundNameEn() {
        return fundNameEn;
    }
    public String getFundNameAr() {
        return fundNameAr;
    }
    public String getInceptionDate() {
        return inceptionDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public List<String> getFundManagers() {
        return fundManagers;
    }
    public List<String> getFundBrokers() {
        return fundBrokers;
    }
    public String getFundCategory() {
        return fundCategory;
    }
    public String getInitialCapital() {
        return initialCapital;
    }
    public String getAggregateCapital() {
        return aggregateCapital;
    }
    public String getInitialNavPerUnit() {
        return initialNavPerUnit;
    }
    public String getInitialUnits() {
        return initialUnits;
    }
    public List<String> getCustodians() {
        return custodians;
    }
    public List<String> getAuditors() {
        return auditors;
    }
}
