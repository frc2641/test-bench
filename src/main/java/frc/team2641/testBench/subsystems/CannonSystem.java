// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.testBench.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Robot;

public class CannonSystem extends SubsystemBase {
  private DoubleSolenoid firstDoubleSolenoid;
  private DoubleSolenoid secondDoubleSolenoid;
  private PneumaticHub ph;
  /** Creates a new SolenoidStuff. */

  private static CannonSystem instance;
  public static CannonSystem getInstance(){
    if (instance == null)
      instance = new CannonSystem();
    return instance;
  }


  public CannonSystem() {
    ph = Robot.getInstance().getPh();
    firstDoubleSolenoid = ph.makeDoubleSolenoid(1, 0);
    secondDoubleSolenoid = ph.makeDoubleSolenoid(2, 3);

    firstDoubleSolenoid.set(DoubleSolenoid.Value.kForward);
    secondDoubleSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void toggleFirst(){
    firstDoubleSolenoid.toggle();
  }
  public void toggleSecond(){
    secondDoubleSolenoid.toggle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
