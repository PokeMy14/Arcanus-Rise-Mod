
package net.mcreator.arcanumrd.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.arcanumrd.itemgroup.ArcanumriseItemGroup;
import net.mcreator.arcanumrd.ArcanumrDModElements;

@ArcanumrDModElements.ModElement.Tag
public class TungstenpikaxeItem extends ArcanumrDModElements.ModElement {
	@ObjectHolder("arcanumr_d:tungstenpikaxe")
	public static final Item block = null;
	public TungstenpikaxeItem(ArcanumrDModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1650;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 0.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TungsteningotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ArcanumriseItemGroup.tab)) {
		}.setRegistryName("tungstenpikaxe"));
	}
}
