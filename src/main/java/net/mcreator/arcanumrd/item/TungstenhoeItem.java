
package net.mcreator.arcanumrd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.arcanumrd.itemgroup.ArcanumriseItemGroup;
import net.mcreator.arcanumrd.ArcanumrDModElements;

@ArcanumrDModElements.ModElement.Tag
public class TungstenhoeItem extends ArcanumrDModElements.ModElement {
	@ObjectHolder("arcanumr_d:tungstenhoe")
	public static final Item block = null;
	public TungstenhoeItem(ArcanumrDModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1800;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TungsteningotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ArcanumriseItemGroup.tab)) {
		}.setRegistryName("tungstenhoe"));
	}
}
