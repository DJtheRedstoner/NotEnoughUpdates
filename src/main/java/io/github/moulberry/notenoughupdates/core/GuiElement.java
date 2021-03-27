package io.github.moulberry.notenoughupdates.core;

public abstract class GuiElement {

    public abstract void render();

    public abstract boolean mouseInput(int mouseX, int mouseY);

    public abstract boolean keyboardInput();
}
