package space.bbkr.resonantlogistics;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.event.GameEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResonantLogistics implements ModInitializer {
	public static final String MODID = "resonantlogistics";

	public static final Logger logger = LogManager.getLogger();

	public static final GameEvent HAILING_FREQUENCY = register("hailing_frequency", 32);
	public static final GameEvent QUERY = register("query", 32);

	@Override
	public void onInitialize() {

	}

	public static GameEvent register(String name, int range) {
		return Registry.register(Registry.GAME_EVENTS, new Identifier(MODID, name), new GameEvent(MODID + ":" + name, range));
	}
}
