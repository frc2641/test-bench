package frc.team2641.testBench.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Constants;

public class Climber extends SubsystemBase {
  private static Climber instance;

  private TalonFX climber;

  public static Climber getInstance() {
    if (instance == null)
      instance = new Climber();
    return instance;
  }

  private Climber() {
    climber = new TalonFX(Constants.CAN.climb);
  }

  public void extend() {
    climber.set(Constants.MotorSpeeds.climbSpeed);
  }

  public void retract() {
    climber.set(-Constants.MotorSpeeds.climbSpeed);
  }

  public void stop() {
    climber.stopMotor();
  }

  @Override
  public void periodic() {
  }
}