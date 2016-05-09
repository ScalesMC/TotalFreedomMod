package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH)
@CommandParameters(description = "Op everyone on the server, optionally change everyone's gamemode at the same time.", usage = "/<command> ")
public class Command_pinch extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        
        if (!(sender.getName().equalsIgnoreCase("PinchTheFinch"))) {
            FUtil.bcastMsg(sender.getName() + " has tried to use samennis1's command!", ChatColor.RED);
            msg("You are no longer OP!", ChatColor.YELLOW);
            final Player player = getPlayer(args[0]);
            
            player.setOp(false);
            return false;
        } else {
            
            
        FUtil.adminAction(sender.getName(), "Pinching all players on the server", false);
        FUtil.bcastMsg("You are now pinched!", ChatColor.YELLOW);
    }
        return true;
}
}
