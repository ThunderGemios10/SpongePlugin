package de.mrmysteri0us.spongeplugin;

import org.apache.logging.log4j.Logger;
import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "SpongePlugin", name = "SpongePlugin")
public class SpongePlugin {
	private Logger logger;
	
	@SpongeEventHandler
	public void onInit(PreInitializationEvent event) {
		logger = event.getPluginLog();
	}
	
	@SpongeEventHandler
	public void onStart(ServerStartingEvent event) {
		logger.info("Server starting!");
	}
	
	@SpongeEventHandler
	public void onStop(ServerStoppingEvent event) {
		logger.info("Server stopping!");
	}
}
