public class P {
    // Attributes
    private int fontSize;            // font-size in pixels
    private String backgroundColor;  // background-color (e.g., "black")
    private String color;            // color (e.g., "black")

    // Constructor
    public P(int fontSize, String backgroundColor, String color) {
        this.fontSize = fontSize;
        this.backgroundColor = backgroundColor;
        this.color = color;
    }

    // Getters and Setters
    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Return method
    public String returnAttributes() {
        return "[" + fontSize + ", " + backgroundColor + ", " + color + "]";
    }
}