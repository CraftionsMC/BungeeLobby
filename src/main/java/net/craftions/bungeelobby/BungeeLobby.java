package net.craftions.bungeelobby;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeLobby extends Plugin {

    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new LobbyCommand("lobby"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new LobbyCommand("hub"));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new LobbyCommand("l"));
        getLogger().info("Loaded " + this.getDescription().getName());
        super.onEnable();
    }
}
