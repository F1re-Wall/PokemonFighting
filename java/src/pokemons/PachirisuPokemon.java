package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import src.moves.SwaggerMove;
import src.moves.RestMove;
import src.moves.TackleMove;
import src.moves.ThunderMove;

public final class PachirisuPokemon extends Pokemon
{
	public PachirisuPokemon(String name, int level, Type type)
	{
		super(name,level);
		this.addType(type);
		this.setStats(60,45,70,45,90,95);
		this.addMove(new SwaggerMove());
		this.addMove(new RestMove());
		this.addMove(new TackleMove());
		this.addMove(new ThunderMove());
	}
}
