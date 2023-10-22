package com.example;
import org.json.JSONObject;
import org.json.XML;


public class XMLComputerInfoAdapter implements ComputerInfoService {
    private JSONComputerInfoService adaptee;

    public XMLComputerInfoAdapter(JSONComputerInfoService adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getComputerInfo() {
        String jsonData = adaptee.getComputerInfoInJSON();

        JSONObject jsonObject = new JSONObject(jsonData);
        return XML.toString(jsonObject);
    }
}