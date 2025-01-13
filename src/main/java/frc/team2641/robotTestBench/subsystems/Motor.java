package frc.team2641.robotTestBench.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2641.robotTestBench.Constants;
import frc.team2641.robotTestBench.Constants.CAN;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import com.ctre.phoenix6.configs.OpenLoopRampsConfigs;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;
/* 
public class Motor extends SubsystemBase
{
    private static Motor instance;
    public TalonFX motor;

    public Motor(int id)
    {
        motor = new TalonFX(id);
        motor.clearStickyFaults();
        motor.setNeutralMode(NeutralModeValue.Coast);
        motor.getConfigurator().apply(new OpenLoopRampsConfigs().withVoltageOpenLoopRampPeriod(0.25));
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
*/

public class Motor extends SubsystemBase
{
    private static Motor instance;
    public WPI_TalonFX motor;

    public Motor(int id)
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


