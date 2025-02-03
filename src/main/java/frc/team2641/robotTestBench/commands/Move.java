package frc.team2641.robotTestBench.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team2641.robotTestBench.subsystems.Motor;

public class Move extends Command {
    private Motor myMotor;

    public Move() {
        this.myMotor = Motor.getInstance();
    }

    @Override
    public void initialize() {
        myMotor.forward(1);
    }

    @Override
    public void end(boolean isInterrupted) {
        myMotor.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    public void execute() {
    }
}