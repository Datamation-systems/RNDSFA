package com.datamation.rndsfa.model.retrofit;

import com.datamation.rndsfa.model.FinvDetL3;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LastThreeInvoiceDetails {

    @SerializedName("RepLastThreeInvDetResult")
    private List<FinvDetL3> invDetResult = null;

    public List<FinvDetL3> getInvDetResult() {
        return invDetResult;
    }

    public void setInvDetResult(List<FinvDetL3> invDetResult) {
        this.invDetResult = invDetResult;
    }



}
