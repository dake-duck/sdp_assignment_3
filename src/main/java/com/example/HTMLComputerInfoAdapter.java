package com.example;
import org.json.JSONObject;

public class HTMLComputerInfoAdapter implements ComputerInfoService {
    private JSONComputerInfoService adaptee;

    public HTMLComputerInfoAdapter(JSONComputerInfoService adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public String getComputerInfo() {
        JSONObject json = new JSONObject(adaptee.getComputerInfoInJSON());

        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html>");

        JSONObject computerInfo = json.getJSONObject("computerInfo"); // Access the inner object

        for (String key : computerInfo.keySet()) {
            String value = computerInfo.getString(key);
            htmlBuilder.append("<div id='" + key + "'>" + value + "</div>");
        }

        htmlBuilder.append("</html>");
        return htmlBuilder.toString();
    }

}