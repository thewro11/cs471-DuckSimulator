package me.thiti.adapters;

import me.thiti.animals.Quackable;
import me.thiti.animals.Goose;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
