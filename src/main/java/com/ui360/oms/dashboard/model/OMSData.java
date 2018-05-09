package com.ui360.oms.dashboard.model;

public class OMSData {

    private String id;
    private String hedgeFundId;
    private String productName;

    public String getId() {
        return id;
    }

    public String getHedgeFundId() {
        return hedgeFundId;
    }

    public String getProductName() {
        return productName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHedgeFundId(String hedgeFundId) {
        this.hedgeFundId = hedgeFundId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OMSData withId(String id){
        this.setId(id);
        return this;
    }

    public OMSData withHedgeFundId(String hedgeFundId){
        this.setHedgeFundId(hedgeFundId);
        return this;
    }

    public OMSData withProductName(String productName){
        this.setProductName(productName);
        return this;
    }
}
