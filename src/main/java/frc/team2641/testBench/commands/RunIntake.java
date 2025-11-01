// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.team2641.testBench.commands;

// import edu.wpi.first.wpilibj2.command.InstantCommand;
// import frc.team2641.testBench.subsystems.Intake;

// /* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
// public class RunIntake extends InstantCommand {

//   private Intake intake;
  

//   /** Creates a new MovePiston. */
//   public RunIntake() {

//     intake = Intake.getInstance();
        
//     addRequirements(intake);
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {
//     intake.smartToggle();
//   }

// }