package frc.team2641.testBench.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team2641.testBench.subsystems.SubTalonFX;
import frc.team2641.testBench.subsystems.SubTalonSRX;

public class Move extends Command {
    private SubTalonFX talonFX;
    private SubTalonSRX talonSRX;

    public Move() {
        this.talonFX = SubTalonFX.getInstance();
        // this.talonSRX = SubTalonSRX.getInstance();
        addRequirements(talonFX);
        // addRequirements(talonSRX);
    }

    @Override
    public void initialize() {
        talonFX.forward(1);
    }

    @Override
    public void end(boolean isInterrupted) {
        talonFX.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    public void execute() {
    }
}