package com.glyart.authmevelocity.spigot.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PreSendLoginEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList( );
    private boolean isCancelled;
    
    public PreSendLoginEvent( Player player ){
        super( player );
    }
    
    @Override
    public boolean isCancelled( ){
        return isCancelled;
    }
    
    @Override
    public void setCancelled( boolean cancelled ){
        this.isCancelled = cancelled;
    }
    
    @Override
    public HandlerList getHandlers( ){
        return HANDLERS;
    }
}
