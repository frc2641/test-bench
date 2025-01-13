package frc.team2641.robotTestBench.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team2641.robotTestBench.subsystems.Motor;


public class Move extends Command
{
    private Motor myMotor;
    // private boolean goingForward;
    private int x = 1;

    public Move(Motor myMotor)
    {
        this.myMotor = myMotor;
    }

    @Override
    public void initialize()
    {
        myMotor.forward(x);
    }

    @Override
    public void end(boolean isInterrupted)
    {
        myMotor.stop();
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }

    public void execute()
    {}

    public void flip()
    {
        x*=-1;
    }
}

