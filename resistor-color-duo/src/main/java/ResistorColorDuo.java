class ResistorColorDuo {

    int value(String[] colors) {

        if (colors.length < 2) {
            return 51;
        } else {
            int firstValue =
                    ResistorColorDuoEnum.valueOf(
                            colors[0].toUpperCase()).getCode();
            int secondValue =
                    ResistorColorDuoEnum.valueOf(
                            colors[1].toUpperCase()).getCode();

            return Integer.parseInt(firstValue + "" + secondValue);
        }
    }
}
