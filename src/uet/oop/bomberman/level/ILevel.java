package uet.oop.bomberman.level;

import uet.oop.bomberman.exceptions.LoadLevelException;

public interface ILevel {

    public void loadLevel(int level) throws LoadLevelException;
}
