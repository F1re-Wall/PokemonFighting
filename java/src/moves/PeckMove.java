package src.moves;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public final class PeckMove extends PhysicalMove
{
	public PeckMove()
	{
		super(Type.FLYING, 35, 100);
	}

	@Override
	protected String describe()
	{
		return "наносит невероятный удар атакой Peck";
	}	
}
