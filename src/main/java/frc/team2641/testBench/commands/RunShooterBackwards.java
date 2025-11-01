// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.testBench.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team2641.testBench.Robot;
import frc.team2641.testBench.RobotContainer;
import frc.team2641.testBench.subsystems.Motor;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class RunShooterBackwards extends Command {
  /** Creates a new RunShooter. */

  private Motor shooter;
  private RobotContainer robotContainer;

  public RunShooterBackwards() {
    // Use addRequirements() here to declare subsystem dependencies.
    shooter = Motor.getInstance();
    robotContainer = Robot.getInstance().getRobotContainer();

    addRequirements(shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    shooter.runBack();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // shooter.run(robotContainer.getLeftJoystick());
  }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
     shooter.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}