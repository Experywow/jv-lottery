package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.toString();
    }
}
