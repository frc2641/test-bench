// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.testBench;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.team2641.testBench.commands.RunShooter;
import frc.team2641.testBench.subsystems.Motor;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very
 * little robot logic should actually be handled in the {@link Robot} periodic
 * methods (other than the scheduler calls).
 * Instead, the structure of the robot (including subsystems, commands, and
 * trigger mappings) should be declared here.
 */
public class RobotContainer {
  private CommandXboxController gamepad = new CommandXboxController(0);
  // private Motor motor;

  public RobotContainer() {

    // motor = Motor.getInstance();
    // motor.setDefaultCommand(new RunShooter());

    configureBindings();
  }

  private void configureBindings() {
    // gamepad.a().onTrue(new ExtendIntake());
    // gamepad.b().whileTrue(new RunIntakeMotor());
    // gamepad.x().whileTrue(new RunIndexer());
    gamepad.y().whileTrue(new RunShooter());
  }

  public Command getAutonomousCommand() {
    return null;
  }

  // public double getLeftJoystick(){
  // return MathUtil.applyDeadband(gamepad.getLeftY(), 0.05)/2;
  // }

}