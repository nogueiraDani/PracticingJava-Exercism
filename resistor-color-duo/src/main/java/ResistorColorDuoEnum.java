public enum ResistorColorDuoEnum {

    BLACK(0),
    BROWN(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6),
    VIOLET(7),
    GREY(8),
    WHITE(9);

    private final int code;

    ResistorColorDuoEnum(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;

    }
}
