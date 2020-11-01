package org.openhab.binding.weatherflowsmartweather.model;

import java.util.Arrays;

public class EventStrikeMessage extends SmartWeatherMessage {
    private int firmware_revision;
    private String hub_sn;
    private int device_id;
    private Object[] evt;

    public int getFirmware_revision() {
        return firmware_revision;
    }

    public void setFirmware_revision(int firmware_revision) {
        this.firmware_revision = firmware_revision;
    }

    public String getHub_sn() {
        return hub_sn;
    }

    public void setHub_sn(String hub_sn) {
        this.hub_sn = hub_sn;
    }

    public int getDevice_id() {
        return device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public Object[] getEvt() {
        return evt;
    }

    public void setEvt(Object[] evt) {
        this.evt = evt;
    }

    @Override
    public String toString() {
        return "EventStrikeMessage [firmware_revision=" + firmware_revision + ", hub_sn=" + hub_sn + ", device_id="
                + device_id + ", evt=" + Arrays.toString(evt) + ", serial_number=" + serial_number + "]";
    }
}
