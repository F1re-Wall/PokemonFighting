package src.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;

public final class CamouflageMove extends StatusMove
{
	public CamouflageMove()
	{
		super(Type.NORMAL, 0, 100);
	}

	@Override
	protected void applySelfEffects(Pokemon p)
	{
		p.setMod(Stat.HP, -5);
	}

	@Override
	protected String describe()
	{
		return "концентрируется";
	}
}
