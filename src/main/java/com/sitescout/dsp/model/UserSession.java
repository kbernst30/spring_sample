package com.sitescout.dsp.model;

import java.io.Serializable;

public class UserSession implements Serializable {

    private int accountId;
    private int advertiserId;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(int advertiserId) {
        this.advertiserId = advertiserId;
    }
}
