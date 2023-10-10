package Package22;

/**
 * 季节枚举类，用于表示四个季节：春天、夏天、秋天和冬天。
 * 每个季节枚举常量都包含一个名称属性，用于描述该季节的名称。
 */
public enum Season {

    /**
     * 春天季节，对应的中文名称为"春天"。
     */

    /*
        Spring实际上是一个实例，调用的是Season的构造方法创建的
        最后用的时候，Season.Spring还能继续调用Season里的方法
     */
    Spring("春天"),

    /**
     * 夏天季节，对应的中文名称为"夏天"。
     */
    Summer("夏天"),

    /**
     * 秋天季节，对应的中文名称为"秋天"。
     */
    Autumn("秋天"),

    /**
     * 冬天季节，对应的中文名称为"冬天"。
     */
    Winter("冬天");

    /**
     * 每个季节枚举常量的名称属性，用于存储季节的名称。
     */
    private final String name;

    /**
     * 枚举常量的构造函数，用于初始化季节的名称属性。
     *
     * @param name 该季节的名称
     */
    Season(String name) {
        this.name = name;
    }

    /**
     * 重写toString()方法，以返回枚举常量的名称。
     *
     * @return 枚举常量的名称
     */
    @Override
    public String toString() {
        return this.name();
    }
}
