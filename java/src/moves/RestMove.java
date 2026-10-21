package src.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;

public final class RestMove extends StatusMove
{
	public RestMove()
	{
		super(Type.PSYCHIC, 0, 100);
	}

	@Override
	protected void applySelfEffects(Pokemon p)
	{
		Effect sleepEffect = new Effect().turns(2);
		sleepEffect.sleep(p);
		p.setMod(Stat.HP, -4);
	}

	@Override
	protected String describe()
	{
		return "засыпает, восполняя себе здоровье";
	}
}
