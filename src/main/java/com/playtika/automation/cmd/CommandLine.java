package com.playtika.automation.cmd;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.xml.stream.FactoryConfigurationError;

public class CommandLine {
    private static Pattern SPLITTER = Pattern.compile("\\s");
    private CommandContext commandContext;
    private CommandFactory commandFactory;

    public CommandLine(){
        commandContext = new CommandContext();
        commandFactory = new CommandFactory();
    }


    public void run() {
        Scanner console = new Scanner(System.in);
        while(commandContext.isWorking()) {
            System.out.printf("$%s> ", commandContext.getPath());
            String line = console.nextLine();
            String[] command = SPLITTER.split(line);
            ConsoleCommand consoleCommand = commandFactory.createCommand(command);
            if (consoleCommand == null) {
                System.out.println("Incorrect command: " + line);
            } else {
                consoleCommand.execute(commandContext);
            }
        }
    }

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        cmd.run();
    }
}
