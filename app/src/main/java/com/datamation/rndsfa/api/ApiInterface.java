package com.datamation.rndsfa.api;

import com.datamation.rndsfa.model.retrofit.LastThreeInvoiceDetails;
import com.datamation.rndsfa.viewmodel.helpers.SharedPref;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Rashmi on 7/15/2019.
 */

public interface ApiInterface {
    @GET("RepLastThreeInvDet/mobile123/{dbname}/{repcode}")
   // Call<LastThreeInvoiceDetails> getInvoiceDetails();
    Call<LastThreeInvoiceDetails> getInvoiceDetails(@Path("dbname") String dbname, @Path("repcode") String repcode);
   // Call<LastThreeInvoiceDetails> getInvoiceDetails(@Query("dbname") String dbname,@Query("RepCode") String repcode);
}
