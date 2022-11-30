package com.if3b.quotes.API;
import com.if3b.quotes.Modul.QuotesModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quotes")
    Call<List<QuotesModel>> requestData();

}
