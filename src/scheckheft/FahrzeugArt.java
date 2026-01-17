package scheckheft;

public enum FahrzeugArt {
    Motorrad("M"),
    Auto("A"),
    LKW("L");

    private final String prefix;

    FahrzeugArt(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
