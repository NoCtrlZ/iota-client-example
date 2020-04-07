package com.iota;

import org.iota.jota.IotaAPI;
import org.iota.jota.dto.response.GetNodeInfoResponse;
import org.iota.jota.error.ArgumentException;

class ConnectToNode {
    public static void main(String[] args) throws ArgumentException {

        IotaAPI api = new IotaAPI.Builder()
            .protocol("https")
            .host("nodes.devnet.thetangle.org")
            .port(443)
            .build();

        GetNodeInfoResponse response = api.getNodeInfo();
        System.out.println(response);
    }
}
