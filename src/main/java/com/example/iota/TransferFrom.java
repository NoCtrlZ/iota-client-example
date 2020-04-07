package com.iota;

import java.util.ArrayList;

import org.iota.jota.IotaAPI;
import org.iota.jota.dto.response.SendTransferResponse;
import org.iota.jota.error.ArgumentException;
import org.iota.jota.model.Transfer;

class TransferFrom {
    public static void main(String[] args) throws ArgumentException {
        IotaAPI api = new IotaAPI.Builder()
        .protocol("https")
        .host("nodes.devnet.thetangle.org")
        .port(443)
        .build();

        int depth = 3;
        int minimumWeightMagnitude = 9;
        int securityLevel = 2;
        int value = 1;
        String mySeed = "ZCESSFRJONLYCLCZBJGWGKMDZBDXEZPUXEUILFYKSOJVEPZPRFMUDAUFFIJKUULJVJVPGBGMSBL9Q9YGO";
        String address = "ZLGVEQ9JUZZWCZXLWVNTHBDX9G9KZTJP9VEERIIFHY9SIQKYBVAHIMLHXPQVE9IXFDDXNHQINXJDRPFDXNYVAPLZAW";

        Transfer Transaction = new Transfer(address, value);
        ArrayList<Transfer> transfers = new ArrayList<Transfer>();
        transfers.add(Transaction);

        try {
            System.out.printf("Sending 1 i to %s", address);
            SendTransferResponse response = api.sendTransfer(mySeed, securityLevel, depth, minimumWeightMagnitude, transfers, null, null, false, false, null);
            System.out.println(response.getTransactions());
        } catch (ArgumentException e) {
            e.printStackTrace();
        }
    }
}
