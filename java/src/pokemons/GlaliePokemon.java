package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import src.moves.OverheatMove;
import src.moves.CamouflageMove;
import src.moves.PeckMove;
import src.moves.FlatterMove;

public final class GlaliePokemon extends Pokemon
{
	public GlaliePokemon(String name, int level, Type type)
	{
		super(name,level);
		this.addType(type);
		this.setStats(80,80,80,80,80,80);
		this.addMove(new OverheatMove());
		this.addMove(new CamouflageMove());
		this.addMove(new PeckMove());
		this.addMove(new FlatterMove());
	}
}
