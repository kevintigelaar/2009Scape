package plugin.npc.familiar;

import plugin.dialogue.DialoguePlugin;
import core.plugin.InitializablePlugin;
import core.game.node.entity.npc.Metamorphosis;

/**
 * Handles the metamorphosis of Vet'ion Jr.
 * @author Empathy
 *
 */
@InitializablePlugin
public class VetionNPC extends Metamorphosis {

	/**
	 * The Vet'ion Ids.
	 */
	public static final int[] VETION_IDS = new int[] { 8600, 8654 };
	
	/**
	 * 
	 * Constructs a new{@code VetionNPC} object.
	 */
	public VetionNPC() {
		super(VETION_IDS);
	}
	
	@Override
	public DialoguePlugin getDialoguePlugin() {
		return null;
	}

}
