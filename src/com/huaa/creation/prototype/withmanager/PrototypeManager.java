package com.huaa.creation.prototype.withmanager;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private Map<String, OfficialDocument> ht = new HashMap<>();
    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    public OfficialDocument getOfficialDocument(String key)
    {
        return ht.get(key).clone();
    }

    public static PrototypeManager getPrototypeManager()
    {
        return pm;
    }
}
