
public class OOPEnums {

    public static void main(String[] args) {

        var myLevel = Level.Low;

        if (myLevel == Level.Low) {
            System.out.println("Düşük seviye!");
        }

        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }
}

enum Level {
    Low,
    Medium,
    High
}

enum Status {

    Low("düşük"),
    Medium("orta"),
    High("yüksek");

    private final String description;

    Status(String description
    ) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
