package src.moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class FlatterMove extends StatusMove
{
	public FlatterMove()
	{
		super(Type.DARK, 0, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p)
	{
		Effect.confuse(p);
		p.setMod(Stat.SPECIAL_ATTACK, 1);
	}

	@Override
	protected String describe()
	{
		return "запутывает врага, повышая его специальную атаку";
	}
}
