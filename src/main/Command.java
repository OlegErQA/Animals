package main;

public enum Command {
    ADD, LIST, EXIT, UNKNOWN;

    public static Command of(String input) {
        for (Command command : Command.values()) {
            if (command.name().equals(input)) {
                return command;
            }
        }
        return UNKNOWN;
    }
}