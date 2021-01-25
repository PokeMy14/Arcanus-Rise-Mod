
package net.mcreator.arcanumrd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.arcanumrd.itemgroup.ArcanumriseItemGroup;
import net.mcreator.arcanumrd.ArcanumrDModElements;

@ArcanumrDModElements.ModElement.Tag
public class RubyItem extends ArcanumrDModElements.ModElement {
	@ObjectHolder("arcanumr_d:ruby")
	public static final Item block = null;
	public RubyItem(ArcanumrDModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ArcanumriseItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ruby");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
