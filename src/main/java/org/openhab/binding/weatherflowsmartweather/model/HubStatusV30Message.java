package org.openhab.binding.weatherflowsmartweather.model;

public class HubStatusV30Message extends HubStatusMessage {

    protected String reset_flags;
    protected int seq;

    /* for internal use only */
    /*
    private String stack;
    private int fs;
    */

    public String getReset_flags() {
        return reset_flags;
    }

    public void setReset_flags(String reset_flags) {
        this.reset_flags = reset_flags;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }


    @Override
    public String toString() {
        return "HubStatusV30Message [firmware_revision=" + firmware_revision + ", uptime=" + uptime + ", rssi=" + rssi
                + ", timestamp=" + timestamp + ", reset_flags=" + reset_flags + ", seq=" + seq
                + "]";
    }
}
