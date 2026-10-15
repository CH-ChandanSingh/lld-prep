package com.techprep.problems.keyvaluestore;

import java.util.concurrent.ConcurrentHashMap;

public class KeyValueStoreApplication {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> secureMap = new ConcurrentHashMap<>();
        secureMap.put("Status", "Codespace Java Environment is Ready!");
        System.out.println("========== SUCCESS ==========");
        System.out.println(secureMap.get("Status"));
        System.out.println("=============================");
    }
}