package me.totalfreedom.totalfreedommod.rank;

import org.bukkit.ChatColor;

public interface RankBase
{

    public String getName();

    public String getTag();

    public ChatColor getColor();

    public String getColoredName();

    public String getColoredTag();

    public String getColoredLoginMessage();

    public boolean isAtLeast(RankBase rank);

    public int getLevel();

}
