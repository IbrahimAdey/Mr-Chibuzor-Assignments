package test;

import java.util.*;

public class GeoPoliticalZoneFinder {

    private static final Map<String, String> stateToZone = new HashMap<>();

    static {
        stateToZone.put("Benue", "North Central");
        stateToZone.put("FCT", "North Central");
        stateToZone.put("Kogi", "North Central");
        stateToZone.put("Kwara", "North Central");
        stateToZone.put("Nasarawa", "North Central");
        stateToZone.put("Niger", "North Central");
        stateToZone.put("Plateau", "North Central");

        stateToZone.put("Adamawa", "North East");
        stateToZone.put("Bauchi", "North East");
        stateToZone.put("Borno", "North East");
        stateToZone.put("Gombe", "North East");
        stateToZone.put("Taraba", "North East");
        stateToZone.put("Yobe", "North East");

        stateToZone.put("Kaduna", "North West");
        stateToZone.put("Katsina", "North West");
        stateToZone.put("Kano", "North West");
        stateToZone.put("Kebbi", "North West");
        stateToZone.put("Sokoto", "North West");
        stateToZone.put("Jigawa", "North West");
        stateToZone.put("Zamfara", "North West");

        stateToZone.put("Abia", "South East");
        stateToZone.put("Anambra", "South East");
        stateToZone.put("Ebonyi", "South East");
        stateToZone.put("Enugu", "South East");
        stateToZone.put("Imo", "South East");

        stateToZone.put("Akwa-Ibom", "South South");
        stateToZone.put("Bayelsa", "South South");
        stateToZone.put("Cross-River", "South South");
        stateToZone.put("Delta", "South South");
        stateToZone.put("Edo", "South South");
        stateToZone.put("Rivers", "South South");

        stateToZone.put("Ekiti", "South West");
        stateToZone.put("Lagos", "South West");
        stateToZone.put("Osun", "South West");
        stateToZone.put("Ondo", "South West");
        stateToZone.put("Ogun", "South West");
        stateToZone.put("Oyo", "South West");
    }

    public static String getZone(String state) {
        return stateToZone.getOrDefault(capitalize(state), "North Central");
    }

    private static String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}

