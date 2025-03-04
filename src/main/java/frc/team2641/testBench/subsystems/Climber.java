package frc.team2641.testBench.subsystems;

import com.ctre.phoenix6.configs.OpenLoopRampsConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Constants;

public class Climber extends SubsystemBase {
  private static Climber instance;

  private TalonFX climber1;
  private TalonFX climber2;

  public static Climber getInstance() {
    if (instance == null)
      instance = new Climber();
    return instance;
  }

  private Climber() {
    climber1 = new TalonFX(Constants.CAN.climb1);
    climber2 = new TalonFX(Constants.CAN.climb2);

    climber1.setNeutralMode(NeutralModeValue.Brake);
    climber2.setNeutralMode(NeutralModeValue.Brake);

    // TalonFXConfigurator configer1 = climber1.getConfigurator();
    // TalonFXConfigurator configer2 = climber2.getConfigurator();
    // TalonFXConfiguration config = new TalonFXConfiguration();
    // config.withOpenLoopRamps(new OpenLoopRampsConfigs().withDutyCycleOpenLoopRampPeriod(2));
    // configer1.apply(config);
    // configer2.apply(config);
  }

  public void extend() {
    climber1.set(Constants.MotorSpeeds.climbSpeed);
    climber2.set(-Constants.MotorSpeeds.climbSpeed);
  }

  public void retract() {
    climber1.set(-Constants.MotorSpeeds.climbSpeed);
    climber2.set(Constants.MotorSpeeds.climbSpeed);
  }

  public void stop() {
    climber1.stopMotor();
    climber2.stopMotor();
  }

  @Override
  public void periodic() {
    if ((Math.abs(climber1.getVelocity().getValue().baseUnitMagnitude()) < 0.1) && (climber1.getTorqueCurrent().getValue().baseUnitMagnitude() > 30)){
      System.out.println("\n\n *** STALL DETECTED - CLIMBER 1 *** \n\n");
    }

    if ((Math.abs(climber2.getVelocity().getValue().baseUnitMagnitude()) < 0.1) && (climber2.getTorqueCurrent().getValue().baseUnitMagnitude() > 30)){
      System.out.println("\n\n *** STALL DETECTED - CLIMBER 2 *** \n\n");
    }
  }
}