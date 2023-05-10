package Package22;

public enum Season {

    Spring("春天"),
    Summer("夏天"),
    Autumn("秋天"),
    Winter("冬天");

    private final String name;

    Season(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.name();
    }
}