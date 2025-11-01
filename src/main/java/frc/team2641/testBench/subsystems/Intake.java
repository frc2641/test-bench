// package frc.team2641.testBench.subsystems;

// import com.ctre.phoenix6.configs.TalonFXConfiguration;
// import com.ctre.phoenix6.configs.TalonFXConfigurator;
// import com.ctre.phoenix6.hardware.TalonFX;
// import com.ctre.phoenix6.signals.InvertedValue;
// import com.ctre.phoenix6.signals.NeutralModeValue;

// import edu.wpi.first.wpilibj.DoubleSolenoid;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.team2641.testBench.Constants;
// import frc.team2641.testBench.Robot;

// public class Intake extends SubsystemBase {

// private boolean isOut = false;
// private TalonFX motor;
// private final DoubleSolenoid solenoid;
// private static Intake instance;

// // private final Pneumatics pneumatics = Pneumatics.getInstance();
// /** Creates a new Intake. */
// private Intake() {
//   solenoid = Robot.getInstance().getPh().makeDoubleSolenoid(6, 7);
//   solenoid.set(DoubleSolenoid.Value.kForward);

//   motor = new TalonFX(Constants.CAN.intakeMotor);
//   configMotor();

//   motor.clearStickyFaults();
// }

//   public static Intake getInstance(){
//       if (instance == null)
//           instance = new Intake();
//       return instance;
//   }

//   public void extend(){
//       if (solenoid.isFwdSolenoidDisabled())
//           solenoid.toggle();
//   }

//   public void retract(){
//       if (solenoid.isRevSolenoidDisabled())
//           solenoid.toggle();
//   }

//   public void toggle(){
//       solenoid.toggle();
//   }

//   public void smartToggle(){
//     toggle();
//     if (isOut)
//     {
//       stop();
//     }
//     else {
//       forward();
//     }
//     isOut = !isOut;
//   }

//   public void forward() {
//     motor.set(Constants.CAN.intakeMotor);
// }

// public void backward(int x) {
//   motor.set(-Constants.CAN.intakeMotor);
// }

// public void stop() {
//     motor.stopMotor();
// }

// private void configMotor(){
//   TalonFXConfigurator configer = motor.getConfigurator();

//   TalonFXConfiguration config = new TalonFXConfiguration();
//     config.MotorOutput.withNeutralMode(NeutralModeValue.Coast);
//     config.MotorOutput.withInverted(InvertedValue.Clockwise_Positive);

//   configer.apply(config);
// }
// }
