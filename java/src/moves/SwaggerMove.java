package src.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;

public final class SwaggerMove extends StatusMove
{
	public SwaggerMove()
	{
		super(Type.NORMAL, 0, 85);
	}

	@Override
	protected void applyOppEffects(Pokemon p)
	{
		Effect.confuse(p);
		p.setMod(Stat.ATTACK, 2);
	}

	@Override
	protected String describe()
	{
		return "вводит врага в ступор, увеличивая его атаку";
	}	
}
