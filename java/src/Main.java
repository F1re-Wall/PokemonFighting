package src;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.pokemons.*;

public class Main
{
	public static void main(String... args)
	{
		Pokemon glalie = new GlaliePokemon("Галя", 5, Type.ICE);
		Pokemon serperior = new SerperiorPokemon("Серёга",5,Type.GRASS);
		Pokemon banette = new BanettePokemon("Ваня", 5, Type.GHOST);
		Pokemon combee = new CombeePokemon("Мая", 5, Type.BUG, Type.FLYING);
		Pokemon vespiquen = new VespiquenPokemon("Елизавета", 5, Type.BUG, Type.FLYING);
		Pokemon pachirisu = new PachirisuPokemon("Дзан Янг", 5, Type.ELECTRIC);

		Battle battle = new Battle();
		
		battle.addAlly(glalie);
		battle.addAlly(serperior);
		battle.addAlly(banette);

		battle.addFoe(combee);
		battle.addFoe(vespiquen);
		battle.addFoe(pachirisu);

		battle.go();
	}
}
