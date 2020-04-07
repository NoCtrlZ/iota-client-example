package com.iota;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.iota.jota.IotaAPI;
import org.iota.jota.error.ArgumentException;
import org.iota.jota.model.Bundle;
import org.iota.jota.model.Transaction;
import org.iota.jota.utils.TrytesConverter;

class GetTransaction {
    public static void main(String[] args) throws ArgumentException, IOException {
            IotaAPI api = new IotaAPI.Builder()
            .protocol("https")
            .host("nodes.devnet.thetangle.org")
            .port(443)
            .build();

            String bundleHash = "HGRGBSAQSKSBCDCX9IFUKDWYTJDKEMHAKWH9LJ9JCBL9EWHLSZQZYQXDZKVICNZKWKKUNTD9OSLVVEGFA";

            try {
                List<Transaction> response = api.findTransactionObjectsByBundle(bundleHash);
                Bundle bundle = new Bundle(response);
                System.out.println(bundle.getMessage());
            } catch (ArgumentException e) {
                e.printStackTrace();
            }
        }
}
