package net.mcreator.intech.client.gui;

public class ExtruderGUIScreen extends AbstractContainerScreen<ExtruderGUIMenu> {

	private final static HashMap<String, Object> guistate = ExtruderGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ExtruderGUIScreen(ExtruderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 190;
	}

	private static final ResourceLocation texture = new ResourceLocation("intech:textures/screens/extruder_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("intech:textures/screens/coal_icon.png"), this.leftPos + 79, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("intech:textures/screens/arrow.png"), this.leftPos + 79, this.topPos + 57, 0, 0, 16, 22, 16, 22);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.intech.extruder_gui.label_extruder"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font,

				ExtruderFuelDisplayProcedure.execute(), 98, 14, -12829636, false);
		guiGraphics.drawString(this.font,

				ExtruderProgressDisplayProcedure.execute(), 98, 86, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

	}

}
