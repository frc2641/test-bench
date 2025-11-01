// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.team2641.testBench.subsystems;

// import com.ctre.phoenix6.configs.TalonFXConfiguration;
// import com.ctre.phoenix6.configs.TalonFXConfigurator;
// import com.ctre.phoenix6.hardware.TalonFX;
// import com.ctre.phoenix6.signals.InvertedValue;
// import com.ctre.phoenix6.signals.NeutralModeValue;

// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.team2641.testBench.Constants;

// public class Indexer extends SubsystemBase {
//   /** Creates a new Indexer. */
//   private TalonFX motor = null;

//   private static Indexer instance;

//   public static Indexer getInstance(){
//     if (instance == null)
//       instance = new Indexer();
//     return instance;
//   }

//   public Indexer() {
//     motor = new TalonFX(Constants.CAN.indexMotor);

//     configMotor();

//     motor.clearStickyFaults();
//   }

//   @Override
//   public void periodic() {
//     // This method will be called once per scheduler run

//   }

//   public void forward() {
//     motor.set(Constants.MotorSpeeds.indexerSpeed);
// }

// public void backward(double x) {
//   motor.set(-Constants.MotorSpeeds.indexerSpeed);
// }

// public void stop() {
//     motor.stopMotor();
// }

// private void configMotor(){
//   TalonFXConfigurator configer = motor.getConfigurator();

//   TalonFXConfiguration config = new TalonFXConfiguration();
//     config.MotorOutput.withNeutralMode(NeutralModeValue.Coast);
//     config.MotorOutput.withInverted(InvertedValue.CounterClockwise_Positive);

//   configer.apply(config);
// }
// }
