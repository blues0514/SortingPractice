import java.util.ArrayList;

public class CommanderManager {
    private CommanderManager() {
    }

    private static CommanderManager _instance;

    public static CommanderManager getInstance() {
        if (_instance == null)
            _instance = new CommanderManager();

        return _instance;
    }

    private ArrayList<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    public void cancelLast() {
        commands.remove(commands.size() - 1);
    }

    public void executeAll() {
        // iterator
        for(Command command : commands) {
            command.execute();
        }
    }
}
