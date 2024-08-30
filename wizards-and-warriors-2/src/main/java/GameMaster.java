public class GameMaster {

    public String describe(Character character){
        return "You're a level %d %s with %d hit points.".formatted(
                character.getLevel(),
                character.getCharacterClass(),
                character.getHitPoints()
        );
    }

    public String describe (Destination destination) {
        return "You've arrived at %s, which has %d inhabitants.".formatted(
                destination.getName(),
                destination.getInhabitants()
        );
    }

    public String describe (TravelMethod travelMethod) {
        return switch (travelMethod) {
            case WALKING -> "You're traveling to your destination by walking.";
            case HORSEBACK -> "You're traveling to your destination on " +
                    "horseback.";
            default -> "";
        };
    }

    public String describe (Character character, Destination destination,
                            TravelMethod travelMethod){
        return "%s %s %s" .formatted(
                describe(character),
                describe(travelMethod),
                describe(destination));
    }

    public String describe (Character character, Destination destination) {
        return "%s You're traveling to your destination by walking. %s".formatted(
                describe(character),
                describe(destination)
        );
    }
}
