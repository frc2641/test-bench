// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.testBench.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Constants;
import frc.team2641.testBench.commands.RunShooter;

public class Motor extends SubsystemBase {
  private TalonFX motor;
  private static Motor instance;

    public static Motor getInstance() {
    if (instance == null)
      instance = new Motor();
    return instance;
  }

  public Motor() {
    motor = new TalonFX(Constants.CAN.shooterMotor);
    configMotor();

    motor.clearStickyFaults();

  }

  private void configMotor(){
  TalonFXConfigurator configer = motor.getConfigurator();

  TalonFXConfiguration config = new TalonFXConfiguration();
    config.MotorOutput.withNeutralMode(NeutralModeValue.Coast);
    config.MotorOutput.withInverted(InvertedValue.Clockwise_Positive);

  configer.apply(config);
}

public void run(double speed) {
  motor.set(speed);
}

public void run(){
  motor.set(Constants.MotorSpeeds.shooterSpeed);
}

public void stop() {
  motor.stopMotor();
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}