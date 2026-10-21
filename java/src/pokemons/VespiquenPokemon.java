package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import src.moves.SwaggerMove;
import src.moves.RestMove;
import src.moves.TackleMove;

public final class VespiquenPokemon extends Pokemon
{
	public VespiquenPokemon(String name, int level, Type firstType, Type secondType)
	{
		super(name,level);
		this.addType(firstType);
		this.addType(secondType);
		this.setStats(70,80,102,80,102,40);
		this.addMove(new SwaggerMove());
		this.addMove(new RestMove());
		this.addMove(new TackleMove());
	}
}
