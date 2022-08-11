package me.thiti.factories;

import me.thiti.animals.MallardDuck;
import me.thiti.animals.Quackable;
import me.thiti.animals.RedheadDuck;
import me.thiti.animals.RubberDuck;
import me.thiti.animals.decorated.QuackCounter;
import me.thiti.animals.decorated.QuackEcho;

public class CountAndEchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
