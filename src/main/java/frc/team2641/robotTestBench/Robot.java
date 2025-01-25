// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.robotTestBench;

import edu.wpi.first.net.PortForwarder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as
 * described in the TimedRobot documentation. If you change the name of this
 * class or the package after creating this
 * project, you must also update the build.gradle file in the project.
 */
public class Robot extends TimedRobot {
  private Timer disabledTimer;

  private static Robot instance;
  public static Robot getInstance() {
    if (instance == null) instance = new Robot();
    return instance;
  }
  
  @Override
  public void robotInit() {
    disabledTimer = new Timer();

    for (int port = 5800; port <= 5807; port++) PortForwarder.add(port, "10.26.41.25", port);    
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {
    disabledTimer.reset();
    disabledTimer.start();   
  }
}