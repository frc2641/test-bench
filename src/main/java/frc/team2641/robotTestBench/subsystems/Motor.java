package frc.team2641.robotTestBench.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.robotTestBench.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Motor extends SubsystemBase {
    private static Motor instance;

    public static Motor getInstance() {
        if (instance == null)
            instance = new Motor();
        return instance;
    }

    public WPI_TalonSRX motor;

    public Motor() {
        motor = new WPI_TalonSRX(Constants.CAN.motor1);

        motor.clearStickyFaults();
        motor.configFactoryDefault();
    }

    @Override
    public void periodic() {
    }

    public void forward(int x) {
        motor.set(x);
    }

    public void backward(int x) {
        motor.set(-x);
    }

    public void stop() {
        motor.stopMotor();
    }
}