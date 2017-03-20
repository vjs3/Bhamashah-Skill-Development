package com.progiants.bhamashahskilldevelopment.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Vishwajeet (vjs3)
 * on 21/3/17.
 */
public class HeadOfFamilyResponse {

    @SerializedName("hof_Details")
    @Expose
    private HofDetails hofDetails;

    public HofDetails getHofDetails() {
        return hofDetails;
    }

    public void setHofDetails(HofDetails hofDetails) {
        this.hofDetails = hofDetails;
    }

}
