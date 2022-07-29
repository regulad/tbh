
package xyz.regulad.tbh.item;

import xyz.regulad.tbh.init.TbhModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

public class CumItem extends BucketItem {
	public CumItem() {
		super(TbhModFluids.CUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
