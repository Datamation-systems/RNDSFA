package com.datamation.rndsfa.model.retrofit;

import com.google.gson.annotations.SerializedName;
import com.datamation.rndsfa.model.FInvhedL3;

import java.util.List;

public class LastThreeInvoiceHeader {

    @SerializedName("RepLastThreeInvHedResult")
    private List<FInvhedL3> invHedResult = null ;

    public List<FInvhedL3> getInvHedResult()
    {
        return invHedResult;
    }

    public void setInvHedResult(List<FInvhedL3> invHedResult)
    {
        this.invHedResult = invHedResult;
    }

}
