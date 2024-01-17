package frc.robot.Subsistemas;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CasisSub extends SubsystemBase {
    //Moteres Derechos
WPI_TalonSRX mD1Enc = new WPI_TalonSRX (1);
WPI_TalonSRX mD2 = new WPI_TalonSRX (2);

    //Motores Derechos
WPI_TalonSRX mI1Enc = new WPI_TalonSRX (3);
WPI_TalonSRX mI2 = new WPI_TalonSRX (4);

DifferentialDrive chasis = new DifferentialDrive(mD1Enc, mI1Enc);

  public void MotorAgrup (){

    mI1Enc.setInverted(true);
    mI2.setInverted(true);

    mD1Enc.setInverted(false);
    mD2.setInverted(false);

    mD2.follow(mD1Enc);
    mI2.follow(mI1Enc);
  }

  public boolean exampleCondition() {
    return false;
  }

  @Override
  public void periodic() {}

  @Override
  public void simulationPeriodic() {}

}
