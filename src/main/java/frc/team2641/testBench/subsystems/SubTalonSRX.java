package frc.team2641.testBench.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class SubTalonSRX extends SubsystemBase {
    private static SubTalonSRX instance;

    public static SubTalonSRX getInstance() {
        if (instance == null)
            instance = new SubTalonSRX();
        return instance;
    }

    public WPI_TalonSRX motor;

    public SubTalonSRX() {
        motor = new WPI_TalonSRX(Constants.CAN.motor);

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