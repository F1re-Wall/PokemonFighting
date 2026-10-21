package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import src.moves.HydroPompMove;
import src.moves.OverheatMove;
import src.moves.FakeOutMove;
import src.moves.MagnitudeMove;

public final class BanettePokemon extends Pokemon
{
	public BanettePokemon(String name, int level, Type type)
	{
		super(name,level);
		this.addType(type);
		this.setStats(64,115,65,83,63,65);
		this.addMove(new HydroPompMove());
		this.addMove(new OverheatMove());
		this.addMove(new FakeOutMove());
		this.addMove(new MagnitudeMove());
	}
}
