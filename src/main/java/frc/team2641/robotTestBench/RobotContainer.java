// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.robotTestBench;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.team2641.robotTestBench.commands.*;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very
 * little robot logic should actually be handled in the {@link Robot} periodic
 * methods (other than the scheduler calls).
 * Instead, the structure of the robot (including subsystems, commands, and
 * trigger mappings) should be declared here.
 */
public class RobotContainer {
  Move m1 = new Move();
  
  private CommandXboxController gamepad = new CommandXboxController(0);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    gamepad.a().whileTrue(m1);
    gamepad.b().onTrue(m1);
  } 
}