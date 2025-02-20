package frc.team2641.testBench.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.testBench.Constants;
import com.ctre.phoenix6.hardware.TalonFX;

public class SubTalonFX extends SubsystemBase {
    private static SubTalonFX instance;

    public static SubTalonFX getInstance() {
        if (instance == null)
            instance = new SubTalonFX();
        return instance;
    }

    public TalonFX motor;

    public SubTalonFX() {
        motor = new TalonFX(Constants.CAN.motor);

        motor.clearStickyFaults();
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