package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import src.moves.HydroPompMove;
import src.moves.OverheatMove;
import src.moves.FakeOutMove;

public final class SerperiorPokemon extends Pokemon
{
	public SerperiorPokemon(String name, int level, Type type)
	{
		super(name,level);
		this.addType(type);
		this.setStats(75,75,95,75,95,113);
		this.addMove(new HydroPompMove());
		this.addMove(new OverheatMove());
		this.addMove(new FakeOutMove());
	}
}
