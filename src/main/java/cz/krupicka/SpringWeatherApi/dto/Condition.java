package cz.krupicka.SpringWeatherApi.dto;

public class Condition{
    private String text;
    private String icon;
    private int code;

    public String getText() {
        return text;
    }

    public String getIcon() {
        return icon;
    }

    public int getCode() {
        return code;
    }
}
