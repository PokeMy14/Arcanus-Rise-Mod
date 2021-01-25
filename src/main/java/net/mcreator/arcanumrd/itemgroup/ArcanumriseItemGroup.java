
package net.mcreator.arcanumrd.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.arcanumrd.item.TungstenpikaxeItem;
import net.mcreator.arcanumrd.ArcanumrDModElements;

@ArcanumrDModElements.ModElement.Tag
public class ArcanumriseItemGroup extends ArcanumrDModElements.ModElement {
	public ArcanumriseItemGroup(ArcanumrDModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarcanumrise") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TungstenpikaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
