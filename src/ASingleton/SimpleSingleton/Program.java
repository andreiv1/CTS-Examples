package ASingleton.SimpleSingleton;

import ASingleton.SimpleSingleton.Logger.ILogger;
import ASingleton.SimpleSingleton.Logger.Logger;

public class Program {
    public static void main(String[] args){
        ILogger logger = Logger.getInstance();

        logger.log("Log started!");
    }
}