package com.ui360.oms.dashboard.controllers;

import com.ui360.oms.dashboard.model.OMSData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/hedgefunds/")
public class OMSServiceContoller {

    @GetMapping("/")
    public OMSData getOMSData(
        //@PathVariable("hedgeFundId") String hedgeFundId,
        //@PathVariable("omsDataId") String omsDataId
         ){

        return new OMSData()
                .withHedgeFundId("HedgeFund")
                .withId("OmsData")
                .withProductName("Equities");
    }

    @GetMapping("/{hedgeFundId}")
    public OMSData getOMSDataById(@PathVariable("hedgeFundId") String hedgeFundId){
        return new OMSData()
                .withHedgeFundId(hedgeFundId)
                .withId("OmsData")
                .withProductName("Equities");
    }
}
