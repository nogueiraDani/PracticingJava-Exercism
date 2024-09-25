class ResistorColor {

    int colorCode(String color) {

        try {
           return ResistorColorEnum.valueOf(color.toUpperCase()).getCode();
        } catch (IllegalArgumentException e){
            return 55;
        }
    }

    String[] colors() {
        return java.util.Arrays.stream(ResistorColorEnum.values())
                .map(Enum::name)
                .map(String::toLowerCase)
                .toArray(String[]::new);
    }
}
