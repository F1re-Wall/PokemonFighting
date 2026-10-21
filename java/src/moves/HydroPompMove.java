package src.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class HydroPompMove extends SpecialMove
{
	public HydroPompMove()
	{
		super(Type.WATER, 110, 80);
	}

	@Override
	protected String describe()
	{
		return "обрушивает сокрушительную мощь атаки Hydro Pomp";
	}
}
