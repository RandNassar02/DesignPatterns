package behavioraldesignpatterns.command;

public class MenuOptions {

    private ActionListenerCommand saveCommand;
    private ActionListenerCommand openCommand;

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }

    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
}
