package com.sitescout.dsp.controller;

import com.sitescout.dsp.model.CampaignDTO;
import com.sitescout.dsp.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/campaigns")
public class CampaignsResource {

    @Autowired
    private CampaignService campaignService;

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody CampaignDTO getCampaign() {
        return campaignService.getCampaign();
    }

    @RequestMapping(value = "/xml", method = RequestMethod.GET, produces = "application/xml")
    public @ResponseBody CampaignDTO getCampaignXml() {
        return campaignService.getCampaign();
    }

}
