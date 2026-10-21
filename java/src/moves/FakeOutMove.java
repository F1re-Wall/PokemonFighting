package src.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public final class FakeOutMove extends PhysicalMove
{
	public FakeOutMove()
	{
		super(Type.NORMAL, 40, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p)
	{
		Effect.flinch(p);
	}

	@Override
	protected String describe()
	{
		return "застовляет врага колыхаться от ужаса";
	}
}
