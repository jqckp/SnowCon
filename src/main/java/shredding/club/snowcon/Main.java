package shredding.club.snowcon;

import shredding.club.snowcon.model.AppSkiMountain;
import shredding.club.snowcon.view.GraphicalInterface;

public class Main {
    
    public static void main(String[] args) {
        //GraphicalInterface.launchGUI(args);

        AppSkiMountain appSki = new AppSkiMountain();

        appSki.collectData();
    }
}
