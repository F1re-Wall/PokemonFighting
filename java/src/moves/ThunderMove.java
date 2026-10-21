package src.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public final class ThunderMove extends SpecialMove
{
	public ThunderMove()
	{
		super(Type.ELECTRIC, 110, 70);
	}

	@Override
	protected void applyOppEffects(Pokemon p)
	{
		if(Math.random() < 0.3)
		{
			Effect.paralyze(p);
		}
	}

	@Override
	protected String describe()
	{
		return "наносит урон, парализовывая врага";
	}
}	
