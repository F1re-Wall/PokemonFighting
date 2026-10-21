package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import src.moves.RestMove;
import src.moves.SwaggerMove;

public final class CombeePokemon extends Pokemon
{
	public CombeePokemon(String name, int level, Type firstType, Type secondType)
	{
		super(name,level);
		this.addType(firstType);
		this.addType(secondType);
		this.setStats(30,30,42,30,42,70);
		this.addMove(new RestMove());
		this.addMove(new SwaggerMove());
	}
}
