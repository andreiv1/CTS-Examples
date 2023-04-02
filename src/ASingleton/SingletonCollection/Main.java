package ASingleton.SingletonCollection;

import ASingleton.SimpleSingleton.Logger.ILogger;
import ASingleton.SimpleSingleton.Logger.Logger;
import ASingleton.SingletonCollection.database.VirusSingletonCollection;
import ASingleton.SingletonCollection.exceptions.VirusAlreadyExistsException;
import ASingleton.SingletonCollection.exceptions.VirusNotFoundException;
import ASingleton.SingletonCollection.models.Virus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws VirusAlreadyExistsException, VirusNotFoundException {
        ILogger logger = Logger.getInstance();
        logger.log("Program started!");

        VirusSingletonCollection virusDatabase = VirusSingletonCollection.getInstance();
        Virus v1 = new Virus("100011001101","Cytovirus");
        Virus v2 = new Virus("110101101001","Neurovirus");
        Virus v3 = new Virus("011010010101","Phagovirus");
        Virus v4 = new Virus("001110111010","Retrovirus");
        Virus v5 = new Virus("101001001110", "Bacteriophage");

        List<Virus> viruses = new ArrayList<>();
        viruses.add(v1);
        viruses.add(v2);
        viruses.add(v3);
        viruses.add(v4);
        viruses.add(v5);
        virusDatabase.addVirusRange(viruses);

        virusDatabase.ShowViruses();

        try {
            virusDatabase.addVirus(v1);
        }
        catch(VirusAlreadyExistsException e){
            logger.log("Oops, virus already exists!");
        }

        try {
            virusDatabase.getVirusByFingerprint("notAFingerPrint");
        }
        catch(VirusNotFoundException e) {
            logger.log("Oops, virus with this fingerprint does not exists.");
        }

        if(virusDatabase.virusExists("101001001110")){
            logger.log("Fingerprint 101001001110 exists.");
        }

        if(!virusDatabase.virusExists("ADSASDSAASSDA")){
            logger.log("Fingerprint does not exists.");
        }
    }
}