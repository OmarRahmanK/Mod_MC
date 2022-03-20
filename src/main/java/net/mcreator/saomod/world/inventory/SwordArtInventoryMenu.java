
package net.mcreator.saomod.world.inventory;

import net.mcreator.saomod.SaoModMod;

public class SwordArtInventoryMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {

	public final static HashMap<String, Object> guistate = new HashMap<>();

	public final Level world;
	public final Player entity;
	public int x, y, z;

	private IItemHandler internal;

	private final Map<Integer, Slot> customSlots = new HashMap<>();

	private boolean bound = false;

	public SwordArtInventoryMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(SaoModModMenus.SWORD_ART_INVENTORY, id);

		this.entity = inv.player;
		this.world = inv.player.level;

		this.internal = new ItemStackHandler(22);

		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}

		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}

		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 7, 84) {

		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 25, 84) {

		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 43, 84) {

		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 61, 84) {

		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 79, 84) {

		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 97, 84) {

		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 115, 84) {

		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 7, 102) {

		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 25, 102) {

		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 43, 102) {

		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 61, 102) {

		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 79, 102) {

		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 97, 102) {

		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 115, 102) {

		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 7, 120) {

		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 25, 120) {

		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 43, 120) {

		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 61, 120) {

		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 79, 120) {

		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 97, 120) {

		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 115, 120) {

		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 151, 102) {

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));

		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));

		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));

	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);

		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();

			if (index < 22) {
				if (!this.moveItemStackTo(itemstack1, 22, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 22, false)) {
				if (index < 22 + 27) {
					if (!this.moveItemStackTo(itemstack1, 22 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 22, 22 + 27, false)) {
						return ItemStack.EMPTY;
					}
				}
				return ItemStack.EMPTY;
			}

			if (itemstack1.getCount() == 0) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}

			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}

			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override /* failed to load code for net.minecraft.world.inventory.AbstractContainerMenu */

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);

		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}

}