package frc.team2641.robotTestBench.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team2641.robotTestBench.subsystems.Climber;

public class Climb extends Command {
  private Climber climber;
  private boolean forwards;
  public Climb(boolean forwards) {
    this.forwards = forwards;
    this.climber = Climber.getInstance();
    addRequirements(climber);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    if(forwards)
      climber.extend();
    else 
      climber.retract();
  }

  @Override
  public void end(boolean interrupted) {
    climber.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}