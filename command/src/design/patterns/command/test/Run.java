package design.patterns.command.test;

import design.patterns.command.*;

public class Run {

	public static void main(String[] args) {
		Television tv = new Television();
		RemoteControl control = new RemoteControl();
		System.out.println("[-] Programming the Remote");
		control.programButton(new TurnOnCommand(tv));
		control.pushMainButton();
		System.out.println("[-] Programming the Remote");
		control.programButton(new VolumeDownCommand(tv));
		control.pushMainButton();
		System.out.println("[-] Undoing last action");
		control.pushUndoButton();
	}

}
