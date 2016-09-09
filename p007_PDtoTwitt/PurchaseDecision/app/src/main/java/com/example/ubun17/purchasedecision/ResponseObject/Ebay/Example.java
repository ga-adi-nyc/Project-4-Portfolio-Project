
package com.example.ubun17.purchasedecision.ResponseObject.Ebay;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Example {

    @SerializedName("findItemsByKeywordsResponse")
    @Expose
    private List<FindItemsByKeywordsResponse> findItemsByKeywordsResponse = new ArrayList<FindItemsByKeywordsResponse>();

    /**
     * 
     * @return
     *     The findItemsByKeywordsResponse
     */
    public List<FindItemsByKeywordsResponse> getFindItemsByKeywordsResponse() {
        return findItemsByKeywordsResponse;
    }

    /**
     * 
     * @param findItemsByKeywordsResponse
     *     The findItemsByKeywordsResponse
     */
    public void setFindItemsByKeywordsResponse(List<FindItemsByKeywordsResponse> findItemsByKeywordsResponse) {
        this.findItemsByKeywordsResponse = findItemsByKeywordsResponse;
    }

}
