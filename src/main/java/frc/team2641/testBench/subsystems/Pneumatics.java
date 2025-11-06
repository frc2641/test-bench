// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.testBench.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Robot;

public class Pneumatics extends SubsystemBase {

  private Compressor compressor;
  private static Pneumatics instance;
  /** Creates a new Pneumatics. */
  public Pneumatics() {
    compressor = Robot.getInstance().getPh().makeCompressor();
  }

  public static Pneumatics getInstance(){
    if(instance == null)
      instance = new Pneumatics();
    return instance;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void enable(){
    System.out.println("enable");
    compressor.enableDigital();
  }

  public void disable(){
    compressor.disable();
  }

  public void initialize(){
    System.out.println("initialize");
    //compressor = Robot.getInstance().getPh().makeCompressor();
  }
}
