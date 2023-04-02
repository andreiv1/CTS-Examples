package ASingleton.SingletonCollection.models;

import java.util.UUID;

public class Virus {
    private String fingerprint;
    private String name;

    public Virus(String fingerprint, String name) {
        this.fingerprint = fingerprint;
        this.name = name;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Virus{" +
                "fingerprint='" + fingerprint + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
