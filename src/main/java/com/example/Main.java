package com.example;

public class Main {
    public static void main(String[] args) {
        JSONComputerInfoService jsonService = new JSONComputerInfoService();

        ComputerInfoService xmlAdapter = new XMLComputerInfoAdapter(jsonService);
        ComputerInfoService htmlAdapter = new HTMLComputerInfoAdapter(jsonService);

        String jsonInfo = jsonService.getComputerInfoInJSON();
        String xmlInfo = xmlAdapter.getComputerInfo();
        String htmlInfo = htmlAdapter.getComputerInfo();

        System.out.println("JSON Format:");
        System.out.println(jsonInfo);
        System.out.println();
        System.out.println("\nXML Format:");
        System.out.println(xmlInfo);
        System.out.println();
        System.out.println("\nHTML Format:");
        System.out.println(htmlInfo);
    }
}