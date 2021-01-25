
package net.mcreator.arcanumrd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.arcanumrd.itemgroup.ArcanumriseItemGroup;
import net.mcreator.arcanumrd.ArcanumrDModElements;

@ArcanumrDModElements.ModElement.Tag
public class TungstenswordItem extends ArcanumrDModElements.ModElement {
	@ObjectHolder("arcanumr_d:tungstensword")
	public static final Item block = null;
	public TungstenswordItem(ArcanumrDModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1698f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TungsteningotItem.block, (int) (1)));
			}
		}, 3, 10f, new Item.Properties().group(ArcanumriseItemGroup.tab)) {
		}.setRegistryName("tungstensword"));
	}
}
