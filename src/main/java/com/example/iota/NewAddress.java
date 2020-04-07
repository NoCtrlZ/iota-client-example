package com.iota;

import org.iota.jota.IotaAPI;
import org.iota.jota.builder.AddressRequest;
import org.iota.jota.dto.response.GetNewAddressResponse;
import org.iota.jota.error.ArgumentException;

class NewAddress {
    public static String main(String mySeed) throws ArgumentException {
        IotaAPI api = new IotaAPI.Builder()
        .protocol("https")
        .host("nodes.devnet.thetangle.org")
        .port(443)
        .build();

        int securityLevel = 2;
        try {
            GetNewAddressResponse response = api.generateNewAddresses(new AddressRequest.Builder(mySeed, securityLevel).amount(1).checksum(true).build());
            String address = response.getAddresses().toString();
            return address;
        } catch (ArgumentException e) {
            e.printStackTrace();
            String error = "None";
            return error;
        }
    }
}