package src.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public final class MagnitudeMove extends PhysicalMove
{
	public MagnitudeMove()
	{
		super(Type.GROUND, 0, 100);
	}

	@Override
	protected double calcBaseDamage(Pokemon att, Pokemon def)
	{
		double rand = Math.random();
		int magnitudePower = 0;

		if(rand < 0.05){magnitudePower = 10;}
		else if(rand < 0.15){magnitudePower = 30;}
		else if(rand < 0.35){magnitudePower = 50;}
		else if(rand < 0.65){magnitudePower = 70;}
		else if(rand < 0.85){magnitudePower = 90;}
		else if(rand < 0.95){magnitudePower = 110;}
		else{magnitudePower = 150;}

		double attackDefenseFactor = this.calcAttDefFactor(att,def);
		return (0.2 * att.getLevel() + 1) * magnitudePower * attackDefenseFactor;
	}

	@Override
	protected String describe()
	{
		return "сотрясает землю нанося невероятные повреждения";
	}
}
