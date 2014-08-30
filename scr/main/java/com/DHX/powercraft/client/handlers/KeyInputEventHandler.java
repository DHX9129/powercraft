package com.DHX.powercraft.client.handlers;

import com.DHX.powercraft.client.settings.KeyBindings;
import com.DHX.powercraft.reference.Key;
import com.DHX.powercraft.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


public class KeyInputEventHandler
  {
    private static Key getPressedKeybinding()
      {
        if (KeyBindings.charge.isPressed())
          {
            return Key.CHARGE;
          }
        else if (KeyBindings.release.isPressed())
          {
            return Key.RELEASE;
          }
        return Key.UNKNOWN;
      }
    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
      {
        LogHelper.info(getPressedKeybinding());
      }
  }
