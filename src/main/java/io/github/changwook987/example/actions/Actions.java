package io.github.changwook987.example.actions;

import java.util.ArrayList;
import java.util.List;

public class Actions {
    public static List<Action> ACTION_LIST = new ArrayList<>();

    public static void init() {
        ACTION_LIST.add(new SummonZombie());
        ACTION_LIST.add(new SummonRandomItem());
        ACTION_LIST.add(new SummonTNT());
        ACTION_LIST.add(new SummonZombie());
    }
}
