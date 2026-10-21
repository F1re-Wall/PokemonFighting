package src.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class OverheatMove extends SpecialMove
{
	public OverheatMove()
	{
		super(Type.FIRE, 130, 90);
	}

	@Override
	protected void applySelfEffects(Pokemon p)
	{
		p.setMod(Stat.SPECIAL_ATTACK, -2);
	}

	@Override
	protected String describe()
	{
		return "изрыгает столп пламени от атаки Overheat";
	}
}

