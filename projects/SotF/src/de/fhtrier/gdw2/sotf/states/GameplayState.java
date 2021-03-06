package de.fhtrier.gdw2.sotf.states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import de.fhtrier.gdw2.sotf.Game.World;

/**
 * @author Kevin Korte
 * @author Attila Djerdj
 * @author Stefan Probst
 *
 */
public class GameplayState extends BasicGameState
{

    // Default State ID Wert -1;
    int stateID = -1;
    World world;

    /**
     * Konstruktor
     * @param stateID
     */
    public GameplayState(int stateID)
    {
        this.stateID = stateID;
    }

    /**
     * Initialisierung
     * @param GameContainer
     * @param StateBasedGame
     */
    @Override
    public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException
    {
        // TODO Auto-generated method stub
    	world = new World();
    }

    @Override
    /**
     * @param GameContainer
     * @param StatedBasedGame
     * @param Graphics
     */
    public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException
    {
        // TODO Auto-generated method stub
        arg2.setBackground(Color.blue);
        world.render(arg0, arg2);

    }

    @Override
    /**
     * @param GameContainer
     * @param StateBasedGame
     * @param int
     */
    public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException
    {
        // TODO Auto-generated method stub

        if (arg0.getInput().isKeyDown(Input.KEY_2))
        {
            arg1.enterState(0);
        }

    }

    @Override
    /**
     * @return state ID
     */
    public int getID()
    {
        // TODO Auto-generated method stub
        return stateID;
    }

}
