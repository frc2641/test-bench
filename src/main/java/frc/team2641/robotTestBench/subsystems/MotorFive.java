package frc.team2641.robotTestBench.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.robotTestBench.Constants;
import frc.team2641.robotTestBench.Constants.CAN;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class MotorFive extends SubsystemBase
{
    private static MotorFive instance;
    public WPI_TalonFX motor;

    public MotorFive(int id)
    {
        motor = new WPI_TalonFX(id);
        motor.clearStickyFaults();
        
        motor.configFactoryDefault();

        // motor.getConfigurator().apply(new OpenLoopRampsConfigs().withVoltageOpenLoopRampPeriod(0.25));
    }

    @Override
    public void periodic()
    {}

    

    public void forward(int x)
    {
        motor.set(x);
    }

    public void backward(int x)
    {
        motor.set(x);
    }

    public void stop()
    {
        motor.stopMotor();
    }
}