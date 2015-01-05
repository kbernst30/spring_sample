package com.sitescout.dsp.service;


import com.sitescout.dsp.model.CampaignDTO;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {

    public CampaignDTO getCampaign() {
        return new CampaignDTO(1, "test");
    }

}
