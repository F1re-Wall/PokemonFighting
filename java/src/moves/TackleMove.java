package src.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class TackleMove extends PhysicalMove
{
	public TackleMove()
	{
		super(Type.NORMAL, 40, 100);
	}

	@Override
	protected String describe()
	{
		return "совершает мощный удар";
	}
}
