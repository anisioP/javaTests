package com.anisio;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherBoard;

    public PC(Case theCase, Monitor monitor, Motherboard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(12000,15,"yellow");
        monitor.drawPixelAt(12000,16,"red");
        monitor.drawPixelAt(12000,17,"blue");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherBoard() {
        return motherBoard;
    }
}
