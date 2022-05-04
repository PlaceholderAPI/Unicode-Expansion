package net.cjservers.unicodeexpansion;

import org.bukkit.OfflinePlayer;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class UnicodeExpansion extends PlaceholderExpansion {
  
  @Override
  public String getAuthor() {
    return "cj89898";
  }
  
  @Override
  public String getIdentifier() {
    return "unicode";
  }
  
  @Override
  public String getVersion() {
    return "1.0.0";
  }
  
  @Override
  public String onRequest(OfflinePlayer p, String s) {
    
    return String.valueOf(Character.toChars(Integer.parseInt(s, 16)));
  }
  
}
