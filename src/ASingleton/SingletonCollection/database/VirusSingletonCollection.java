package ASingleton.SingletonCollection.database;


import ASingleton.SingletonCollection.exceptions.VirusAlreadyExistsException;
import ASingleton.SingletonCollection.exceptions.VirusNotFoundException;
import ASingleton.SingletonCollection.models.Virus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirusSingletonCollection {
    private static VirusSingletonCollection INSTANCE;

    private Map<String, Virus> viruses;
    private VirusSingletonCollection(){
        viruses = new HashMap<String,Virus>();
    }

    // Lazy load
    public synchronized static VirusSingletonCollection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new VirusSingletonCollection();
        }

        return INSTANCE;
    }

    public synchronized void addVirus(Virus virus) throws VirusAlreadyExistsException, VirusNotFoundException {
        if(virusExists(virus.getFingerprint())) {
            throw new VirusAlreadyExistsException();
        }
        viruses.put(virus.getFingerprint(),virus);
    }

    public synchronized void addVirusRange(List<Virus> viruses) throws VirusAlreadyExistsException, VirusNotFoundException {
        if(viruses != null) {
            for(var virus : viruses) {
                addVirus(virus);
            }
        }
    }

    public synchronized Virus getVirusByFingerprint(String fingerprint) throws VirusNotFoundException {
        if(!virusExists(fingerprint)) {
            throw new VirusNotFoundException();
        }
        return viruses.get(fingerprint);
    }

    public synchronized boolean virusExists(String fingerprint) throws VirusNotFoundException {
        return viruses.containsKey(fingerprint);
    }

    public void ShowViruses(){
        for(var v : viruses.values()){
            System.out.println(v);
        }
    }
}
