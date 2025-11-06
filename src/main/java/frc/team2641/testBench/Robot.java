// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.testBench;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.team2641.testBench.subsystems.Pneumatics;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
  private Command autonomousCommand;

  private final PneumaticHub ph = new PneumaticHub(Constants.CAN.ph);
  private RobotContainer robotContainer;
  private Pneumatics pneumatics;
  // private CommandXboxController gamepad;
  

  private static Robot instance;
  public static Robot getInstance() {
    if (instance == null) instance = new Robot();
    return instance;
  }

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  public Robot() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
  }
  
  @Override
  public void robotInit() {
    pneumatics = Pneumatics.getInstance();
    pneumatics.initialize();
    robotContainer = new RobotContainer();
    // gamepad = robotContainer.getGamepad();
  }
  
  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {
    pneumatics.disable();
  }

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {
    autonomousCommand = robotContainer.getAutonomousCommand();

    // schedule the autonomous command (example)
    if (autonomousCommand != null) {
      autonomousCommand.schedule();
    }
    pneumatics.enable();
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (autonomousCommand != null) {
      autonomousCommand.cancel();
    }
    pneumatics.enable();
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
    pneumatics.enable();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {
    pneumatics.enable();
  }

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}

  public PneumaticHub getPh(){
    return ph;
  }
  public RobotContainer getRobotContainer(){
    return robotContainer;
  }

  // public double getLeftJoystick(){
  //   try {
  //     return MathUtil.applyDeadband(robotContainer.getGamepad().getLeftY(), 0.05)/2;
  //   } 
  //   catch (NullPointerException e) {
  //     System.out.println("Null Pointer Exception ):");
  //     e.printStackTrace();
  //     return -1;
  //   }
  // }
  // public double getLeftJoystick(){
  //   if(gamepad == null && robotContainer != null)
  //     gamepad = robotContainer.getGamepad();
  //     if (robotContainer == null)
  //     {
  //       System.out.println("HOW !!?!?!?");
  //     }
  //   if(gamepad == null)
  //   {
  //     System.out.println("WHY !?!!?!?");
  //     return -1;
  //   }
  //   return MathUtil.applyDeadband(gamepad.getLeftY(), 0.05)/2;
  // }
}
